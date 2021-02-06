import java.util.ArrayList;
import java.util.List;

public class Counselor extends Teacher implements Manage{         //辅导员一般没有授课，所以课程信息(Teacher_list)代表管理范围内所有课程的上课信息
    protected String Counselor_college;                           //添加辅导员学院信息
    protected List<Course> class_situation;                       //添加今天所有的上课情况信息
    public Counselor(int Teacher_id, String Teacher_name,String Counselor_college,List<Course> Teacher_list,List<Course> class_situation){
        super(Teacher_id,Teacher_name,Teacher_list);
        this.Counselor_college = Counselor_college;
        this.class_situation = class_situation;
    }
    public String toString(){                           //重写toString
        return this.get_information() + " " + Counselor_college + " 辅导员";
    }
    public List<String> get_student_course(Student stu) {         //根据学生信息获取学生应上课程名
        List<String> l = new ArrayList<>();
        for(Course x:Teacher_list){
            for(Student s:x.Course_list){
                if(s.equals(stu)){
                    l.add(x.Course_name);
                    break;
                }
            }
        }
        return l;
    }
    public void out_of_course(List<String> course_list,Student stu) throws Truancy{       //根据今天的课程信息和学生应上的课程对照查询出学生是否有旷课，有旷课则抛出异常
        List<Course> l = new ArrayList<>();
        for(String s:course_list){
            for(Course x:class_situation){
                if(x.Course_name.equals(s) && !x.Course_list.contains(stu)){
                    l.add(x);
                }
            }
        }
        if(!l.isEmpty()){
            throw new Truancy(l);
        }else{
            System.out.println("-----该生学习习惯良好，并无旷课-----");
        }
    }
}
