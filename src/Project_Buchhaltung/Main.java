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
        allTogether.add(new Worker("Britney Spears",18,184));
        allTogether.add(new Worker("Christina Aguilera",19,184));
        allTogether.add(new Worker("Justin Timberlake", 20,184));
        allTogether.add(new Worker("Jessica Bill",17,184));
        allTogether.add(new Worker("Cameron Diaz",17,184));
        allTogether.add(new Worker("Nelly Furtado",16,184));
        allTogether.add(new Worker("Amanda Seyfried",19,184));
        allTogether.add(new Worker("Taylor Swift",18,184));
        allTogether.add(new Worker("Pharrell Williams",19,184));
        allTogether.add(new Worker("Anna Kendrick",18,184));
        allTogether.add(new Manager("Jennifer Lopez",16000,10,120));
        allTogether.add(new Manager("Shakira Shakirowna",20000,11,110));
        allTogether.add(new Manager("Beyonce Beyoncowna",50000,10,100));
        allTogether.add(new Manager("Adele Adelewna",19000,12,50));
        allTogether.add(new Manager("Miley Cyrus",40000,12,90));

        System.out.println(allTogether);

        System.out.println(allTogether.get(10).salary(allTogether.get(10)));

        System.out.println(company.sumSalaryOfAllEmployee(allTogether));

        System.out.println(Employee.dismissal(allTogether,14));
        System.out.println(Employee.dismissal(allTogether,14));

        Employee employee = new Manager("Michael Jackson", 50000,12,130);
        System.out.println(employee.salary(employee));

        System.out.println(company.recruit(employee,allTogether));

        System.out.println(allTogether);
        Employee employee1= new Manager("Edgar Arushanyan",56000, 12,150);
        System.out.println(employee1);
        System.out.println(company.recruit(employee1,allTogether));
        System.out.println(allTogether);














    }
}