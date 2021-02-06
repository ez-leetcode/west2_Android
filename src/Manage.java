import java.util.List;

public interface Manage {
    List<String> get_student_course(Student stu);    //根据学生姓名查找出他应上的课程
    void out_of_course(List<String> course_list,Student stu);     //根据应上课程找出他所旷课程
}
