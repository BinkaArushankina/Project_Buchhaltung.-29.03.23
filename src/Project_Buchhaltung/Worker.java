package Project_Buchhaltung;

public class Worker extends Employee {
    private int id;
    private String name;
    private int salaryPerHour;
    private int workHoursPerMonth;



    public Worker(int id, String name, int salaryPerHour, int workHoursPerMonth) {
        this.id = id;
        this.name = name;
        this.salaryPerHour=salaryPerHour;
        this.workHoursPerMonth=workHoursPerMonth;
    }
    int salary() {
        int salary=(salaryPerHour*workHoursPerMonth);
        int salaryWithPercent= salary-(salary*19)/100;
        if(salaryPerHour>160){
            salary=salary+((workHoursPerMonth-160)*(salaryPerHour+6));
        }
        if(salary<MIN_SALARY){
            return MIN_SALARY;
        }

        return salaryWithPercent;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public int getSalaryPerHour() {
        return salaryPerHour;
    }
    public int getWorkHoursPerMonth() {
        return workHoursPerMonth;
    }
    public String toString() {
        return "\nEmployees " +
                "id - " + id +
                ", name - " + name +
                ", salary per hour - " + salaryPerHour +
                ", work hours in month - " + workHoursPerMonth ;
    }
}
