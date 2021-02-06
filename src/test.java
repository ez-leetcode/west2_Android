import java.util.ArrayList;
import java.util.List;
public class test {
    public static void main(String[] args) {
        Student s1 = new Student("小旭",10001,"机械学院");
        Student s2 = new Student("小亮",10002,"土木工程学院");
        Student s3 = new Student("小明",10003,"石化学院");
        Student s4 = new Student("小丽",10004,"数计学院");
        List<Student> student_list1 = new ArrayList<>();               //学生列表
        student_list1.add(s1);
        student_list1.add(s2);
        student_list1.add(s3);
        student_list1.add(s4);
        DS_Course course1 = new DS_Course("算法与数据结构","余春艳","东3-100",student_list1);         //两种课程实例
        Java_Course course2 = new Java_Course("面向对象程序设计(Java)","余春艳","西1-202",student_list1);
        List<Course> course_list1 = new ArrayList<>();
        course_list1.add(course1);
        course_list1.add(course2);
        Teacher teacher1 = new Teacher(10005,"余春艳",course_list1);        //老师实例
        List<Student> student_list2 = new ArrayList<>();             //今日上课学生列表(没有把小旭(s1)放进去，代表旷课)
        student_list2.add(s2);
        student_list2.add(s3);
        student_list2.add(s4);
        DS_Course course3 = new DS_Course("算法与数据结构","余春艳","东3-100",student_list2);
        List<Course> course_list2 = new ArrayList<>();              //今日所有课程上课信息(除了小旭(s1)以外都有来上课)
        course_list2.add(course2);
        course_list2.add(course3);
        Counselor counselor1 = new Counselor(10006,"小颜","数计学院",course_list1,course_list2);         //辅导员实例
        System.out.println("-------------------------测试toString方法(Student)---------------------------");
        System.out.println(s1.toString());
        System.out.println("-------------------------测试toString方法(Course)----------------------------");
        System.out.println(course1.toString());
        System.out.println("-------------------------测试toString方法(Teacher)---------------------------");
        System.out.println(teacher1.toString());
        System.out.println("-------------------------测试toString方法(Counselor)-------------------------");
        System.out.println(counselor1.toString());
        System.out.println("-------------------------测试toString方法(DS_Course)-------------------------");
        System.out.println(course1.toString());
        System.out.println("-------------------------测试toString方法(Java_Course)-----------------------");
        System.out.println(course2.toString());
        System.out.println("----测试get_student_course方法和out_of_course方法和异常Truancy抛出(Counselor)---");
        List<String> list1 = counselor1.get_student_course(s1);      //获取小旭应上的所有课程(有旷课)
        List<String> list2 = counselor1.get_student_course(s2);      //获取小亮应上的所有课程(无旷课)
        try{
            counselor1.out_of_course(list1,s1);        //根据手上的课程信息和小旭应上的所有课程对比，若小旭旷课则抛出异常并输出旷课信息
        }catch (Truancy e){
            e.print_information();
        }
        try{
            counselor1.out_of_course(list2,s2);        //相应的，小亮没有旷课所以会给应有的提示
        }catch (Truancy e){
            e.print_information();
        }
        //大概就这么多吧~
    }
}
