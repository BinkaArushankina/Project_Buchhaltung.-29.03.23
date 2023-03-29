package Project_Buchhaltung;


public abstract class Employee {
    private int id;
    private String name;
    private int salaryPerHour;
    private int workHoursPerMonth;
    private int sale;
    private int percentageOfTheSale;
    public final int MIN_SALARY = 1400;



    abstract int salary();

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
    public int getSale() {
        return sale;
    }
    public int getPercentageOfTheSale() {
        return percentageOfTheSale;
    }
    public int getMIN_SALARY() {
        return MIN_SALARY;
    }


}
