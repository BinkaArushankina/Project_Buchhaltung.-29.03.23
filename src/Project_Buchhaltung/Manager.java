package Project_Buchhaltung;


public class Manager extends Employee {
    private int id;
    private String name;
    private int sale;
    private int percentageOfTheSale;
    private int workHoursPerMonth;


    public Manager(int id, String name, int sale, int percentageOfTheSale, int workHoursPerMonth) {
        this.id =id;
        this.name=name;
        this.sale=sale;
        this.percentageOfTheSale=percentageOfTheSale;
        this.workHoursPerMonth=workHoursPerMonth;
    }
    int salary() {
        int salary=sale*percentageOfTheSale/100;
        int salaryWithPercent=salary-(salary*19)/100;
        if(workHoursPerMonth<100){
            return salaryWithPercent;
        }else{
            int minSalary=MIN_SALARY-(MIN_SALARY*19)/100;
            return minSalary+salaryWithPercent;
        }
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSale() {
        return sale;
    }

    public int getPercentageOfTheSale() {
        return percentageOfTheSale;
    }

    public int getWorkHoursPerMonth() {
        return workHoursPerMonth;
    }

    public String toString() {
        return "\nManager " +
                "id - " + id +
                ", name - " + name +
                ", sale - " + sale +
                ", percentage of the sale - " + percentageOfTheSale +
                ", work hours in month - " + workHoursPerMonth ;
    }
}
