package Project_Buchhaltung;
import java.util.List;

public class Company {


    public int sumSalaryOfAllEmployee(List<Employee> workers){
        int sum=0;
        for(Employee empl : workers){
            sum+=empl.salary();
        }
        return sum;
    }

    boolean recruit(Employee employee,List<Employee> workers) {
        boolean recruit;
        if(workers.size()<20) {
            recruit = workers.add(employee);
            return recruit;
        }else{
            System.out.println("too much Employees in state");
            return false;
        }
    }
    boolean dismissal(List<Employee> workers, int id){
        return workers.remove(workers.get(id));
    }


}
