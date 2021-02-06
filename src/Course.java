import java.util.List;
public abstract class Course {
    protected String Course_name;
    protected String Course_teacher;
    protected String Course_place;
    protected List<Student> Course_list ;
    public Course(String Course_name,String Course_teacher,String Course_place,List<Student> Course_list){
        this.Course_name = Course_name;
        this.Course_teacher = Course_teacher;
        this.Course_place = Course_place;
        this.Course_list = Course_list;
    }
    public String getCourse_name(){
        return Course_name;
    }
    public String get_information(){
        return "课程名称:" + Course_name + " 课程教师:" + Course_teacher + " 上课地点:" + Course_place;
    }
    public abstract String toString();
}
