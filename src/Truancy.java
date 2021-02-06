import java.util.List;

public class Truancy extends RuntimeException{
    protected List<Course> Truancy_list;
    public Truancy(List<Course> Truancy_list){
        this.Truancy_list = Truancy_list;
    }
    public void print_information(){
        System.out.println("--------该生存在旷课行为-------");
        System.out.println("所旷课程如下:");
        for(Course x:Truancy_list){
            System.out.println(x.Course_name);
        }
    }
}
