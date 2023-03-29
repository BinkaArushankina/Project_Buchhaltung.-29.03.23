package Project_Buchhaltung;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Тех задание:
        // Молодому рекламному агентству нужна новая бухгалтерская программа.
        // У заказчика следующие требования. Программа должна уметь:

        // *-добавлять сотрудников в штат
        // *-удалять сотрудников из штата
        // *-рассчитывать зарплату для двух категорий сотрудников:
        // * сотрудника с почасовой оплатой и менеджера по продажам
        // *-выводить на экран список сотрудников
        // *-суммировать зарплату всех сотрудников
        // *-у сотрудника на почасовой оплате должно быть поле ставка за час. Метод расчета его зарплаты должен
        // * учитывать минимальный размер оплаты труда
        // *-у менеджера по продажам нет фиксированной оплаты, его зарплата рассчитывается как процент от обьема продаж
        // * Но в его случае также должен учитываься минимальный размер оплаты труда.
        Company company= new Company();

        List<Employee> allTogether = new ArrayList<>();
        allTogether.add(new Worker(0,"Britney Spears",18,184));
        allTogether.add(new Worker(1,"Christina Aguilera",19,184));
        allTogether.add(new Worker(2,"Justin Timberlake", 20,184));
        allTogether.add(new Worker(3,"Jessica Bill",17,184));
        allTogether.add(new Worker(4,"Cameron Diaz",17,184));
        allTogether.add(new Worker(5,"Nelly Furtado",16,184));
        allTogether.add(new Worker(6,"Amanda Seyfried",19,184));
        allTogether.add(new Worker(7,"Taylor Swift",18,184));
        allTogether.add(new Worker(8,"Pharrell Williams",19,184));
        allTogether.add(new Worker(9,"Anna Kendrick",18,184));
        allTogether.add(new Manager(10,"Jennifer Lopez",16000,10,120));
        allTogether.add(new Manager(11,"Shakira Shakirowna",20000,11,110));
        allTogether.add(new Manager(12,"Beyonce Beyoncowna",50000,10,100));
        allTogether.add(new Manager(13,"Adele Adelewna",19000,12,50));
        allTogether.add(new Manager(14,"Miley Cyrus",40000,12,90));

        System.out.println(allTogether);

        System.out.println(allTogether.get(10).salary());

        System.out.println(company.sumSalaryOfAllEmployee(allTogether));

        System.out.println(company.dismissal(allTogether,14));

        Employee employee = new Manager(15,"Michael Jackson", 50000,12,130);


        System.out.println(company.recruit(employee,allTogether));

        System.out.println(allTogether);
        Employee employee1= new Manager(15,"Edgar Arushanyan",56000, 12,150);

        System.out.println(company.recruit(employee1,allTogether));
        System.out.println(allTogether);














    }
}