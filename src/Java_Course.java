import java.util.List;

public class Java_Course extends Course{
    public Java_Course(String Course_name, String Course_teacher, String Course_place, List<Student> Course_list){
        super(Course_name,Course_teacher,Course_place,Course_list);
    }
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append(this.get_information());
        s.append('\n');
        s.append("上课学生信息如下:");
        s.append('\n');
        for(Student x:Course_list){
            s.append(x.get_information());
        }
        return s.toString();
    }
}
