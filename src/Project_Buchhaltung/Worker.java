package Project_Buchhaltung;

public class Worker extends Employee {
    private int salaryPerHour;


    public Worker( String name ,  int salaryPerHour,int workHoursPerMonth) {
        super(name, workHoursPerMonth);
        this.salaryPerHour=salaryPerHour;
    }
    int salary(Employee employee) {
        int minSalary=MIN_SALARY-(MIN_SALARY*19)/100;
        int salary=(salaryPerHour*employee.getWorkHoursPerMonth());
        int salaryWithPercent= salary-(salary*19)/100;
        if(salaryPerHour>160){
            salaryWithPercent=salaryWithPercent+((employee.getWorkHoursPerMonth()-160)*(salaryPerHour+6));
        }
        if(salaryWithPercent<minSalary){
            return minSalary;
        }

        return salaryWithPercent;
    }


    public String toString() {
        return "\nWorker " +super.toString()+
                ", salary per hour=" + salaryPerHour ;
    }
}
