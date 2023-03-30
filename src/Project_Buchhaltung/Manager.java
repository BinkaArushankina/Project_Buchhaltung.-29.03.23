package Project_Buchhaltung;

public class Manager extends Employee {

    private int sale;
    private int percentageOfTheSale;

    public Manager(String name, int sale, int percentageOfTheSale, int workHoursPerMonth) {
        super(name, workHoursPerMonth);
        this.sale = sale;
        this.percentageOfTheSale = percentageOfTheSale;
    }

    int salary(Employee employee) {

        int minSalary=MIN_SALARY-(MIN_SALARY*19)/100;
        int salary=sale*percentageOfTheSale/100;
        int salaryWithPercent=salary-(salary*19)/100;

        if(employee.getWorkHoursPerMonth()<100){
            return salaryWithPercent;
        }else{
            return minSalary+salaryWithPercent;
        }
    }

    public String toString() {
        return " \nManager " +super.toString()+
                ", sale=" + sale +
                ", percentage of the sale=" + percentageOfTheSale;
    }
}
