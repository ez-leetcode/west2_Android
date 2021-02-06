public class Student {
    protected String name;
    protected int id;
    protected String college;
    public Student(String name,int id,String college){
        this.name = name;
        this.id = id;
        this.college = college;
    }
    public String toString(){
        return "大家好，我是来自" + college + "的" + id + "号，我叫" + name + "，很高兴认识大家！";
    }
    public String get_information(){
        return "学号:" + id + " 学生姓名:" + name + " 所在学院:" + college + '\n';
    }
}
