package Project_Buchhaltung;


import java.util.List;

public abstract class Employee {
    private int id;
    private String name;
    private int workHoursPerMonth;
    public final int MIN_SALARY = 1400;
    static int count=0;

    public Employee( String name, int workHoursPerMonth) {
        this.id = count++;
        this.name = name;
        this.workHoursPerMonth = workHoursPerMonth;
    }

    abstract int salary(Employee employee);


    static boolean dismissal(List<Employee> workers, int id){
        for (int i=0; i< workers.size(); i++){
            if(workers.get(i).getId()==id){
                 workers.remove(workers.get(i));
                 return true;
            }
        }
      return false;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public int getWorkHoursPerMonth() {
        return workHoursPerMonth;
    }


    public String toString() {
        return
                "id=" + id +
                ", name=" + name +
                ", workHoursPerMonth=" + workHoursPerMonth ;
    }
}
