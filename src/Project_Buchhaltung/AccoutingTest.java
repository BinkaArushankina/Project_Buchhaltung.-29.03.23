package Project_Buchhaltung;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;

import static org.testng.AssertJUnit.*;

public class AccoutingTest {

    @Test
    public void testing_method_salaryForManager(){
        Manager manager= new Manager("Jack",16000,10,120);

        int expected=2430;

        assertEquals(expected,manager.salary(manager));
    }

    @Test
    public void testing_method_salaryForManager_MIN(){
        Manager manager= new Manager("Jack",16000,10,90);

        int expected=1296;

        assertEquals(expected,manager.salary(manager));
    }

    @Test
    public void testing_method_salaryForWorker(){
       Worker worker= new Worker("Jack",18,184);

        int expected=2683;

        assertEquals(expected,worker.salary(worker));
    }

    @Test
    public void testing_method_salaryForWorker_MIN(){
        Worker worker= new Worker("Jack",18,90);

        int expected=1313;

        assertEquals(expected,worker.salary(worker));
    }


    @Test
    public void sumSalaryOfAllEmployee_testing(){
        Company company= new Company();
        List<Employee>actual = new ArrayList<>();
        actual.add( new Manager("Jack",16000,10,120));
        actual.add( new Worker("Jack",18,184));
        int expected =5113;

        assertEquals(expected,company.sumSalaryOfAllEmployee(actual));
    }

    @Test
    public void dismissal_testing(){
        List<Employee>actual = new ArrayList<>();
        actual.add( new Manager("Jack",16000,10,120));
        actual.add( new Worker("Jack",18,184));

        assertTrue(Employee.dismissal(actual,0));
    }

    @Test
    public void dismissal_testing_false(){
        List<Employee>actual = new ArrayList<>();
        actual.add( new Manager("Jack",16000,10,120));
        actual.add( new Worker("Jack",18,184));

        assertFalse(Employee.dismissal(actual,3));
    }

    @Test
    public void recruit_testing(){
        Company company= new Company();
        List<Employee>actual = new ArrayList<>();
        actual.add( new Manager("Jack",16000,10,120));
        Worker worker= new Worker("Jack",18,184);

        assertTrue(company.recruit(worker,actual));
    }
    @Test
    public void recruit_testing_twenty(){
        Company company= new Company();
        List<Employee>actual = new ArrayList<>();
        actual.add(new Worker("Britney Spears",18,184));
        actual.add(new Worker("Christina Aguilera",19,184));
        actual.add(new Worker("Justin Timberlake", 20,184));
        actual.add(new Worker("Jessica Bill",17,184));
        actual.add(new Worker("Cameron Diaz",17,184));
        actual.add(new Worker("Nelly Furtado",16,184));
        actual.add(new Worker("Amanda Seyfried",19,184));
        actual.add(new Worker("Taylor Swift",18,184));
        actual.add(new Worker("Pharrell Williams",19,184));
        actual.add(new Worker("Anna Kendrick",18,184));
        actual.add(new Manager("Jennifer Lopez",16000,10,120));
        actual.add(new Manager("Shakira Shakirowna",20000,11,110));
        actual.add(new Manager("Beyonce Beyoncowna",50000,10,100));
        actual.add(new Manager("Adele Adelewna",19000,12,50));
        actual.add(new Manager("Miley Cyrus",40000,12,90));
        actual.add(new Manager("Jack",16000,10,120));
        actual.add(new Worker("Jack",18,184));
        actual.add(new Worker("Jane",18,184));
        actual.add(new Worker("John",20,45));
        actual.add(new Worker("Dan",18,190));

        Worker worker= new Worker("Edgar Arushanyan",30,160);
        assertFalse(company.recruit(worker,actual));
    }







}
