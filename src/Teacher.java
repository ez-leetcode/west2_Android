import java.util.List;
public class Teacher {
    protected int Teacher_id;
    protected String Teacher_name;
    protected List<Course> Teacher_list;
    public Teacher(int Teacher_id,String Teacher_name,List<Course> Teacher_list){
        this.Teacher_id = Teacher_id;
        this.Teacher_name = Teacher_name;
        this.Teacher_list = Teacher_list;
    }
    public String get_information(){
        return "教师姓名:" + Teacher_name + " 工号:" + Teacher_id;
    }
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append(this.get_information());
        s.append('\n');
        s.append("所授课程如下:");
        s.append('\n');
        for(Course x:Teacher_list){
            s.append(x.getCourse_name());
            s.append('\n');
        }
        return s.toString();
    }
}
