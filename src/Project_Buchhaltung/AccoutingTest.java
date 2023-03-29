package Project_Buchhaltung;


import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class AccoutingTest {



    @Test
    public void testing_method_salaryForManager(){
        Manager manager= new Manager(10,"Jack",16000,10,120);

        int expected=2430;

        assertEquals(expected,manager.salary());
    }
    @Test
    public void testing_method_salaryForWorker(){
       Worker worker= new Worker(0,"Jack",18,184);

        int expected=2683;

        assertEquals(expected,worker.salary());
    }


    @Test
    public void sumSalaryOfAllEmployee_testing(){
        Company company= new Company();
        List<Employee>actual = new ArrayList<>();
        actual.add( new Manager(10,"Jack",16000,10,120));
        actual.add( new Worker(0,"Jack",18,184));
        int expected =5113;

        assertEquals(expected,company.sumSalaryOfAllEmployee(actual));
    }

    @Test
    public void dismissal_testing(){
        Company company= new Company();
        List<Employee>actual = new ArrayList<>();
        actual.add( new Manager(10,"Jack",16000,10,120));
        actual.add( new Worker(0,"Jack",18,184));

        assertTrue(company.dismissal(actual,0));
    }

    @Test
    public void recruit_testing(){
        Company company= new Company();
        List<Employee>actual = new ArrayList<>();
        actual.add( new Manager(10,"Jack",16000,10,120));
        Worker worker= new Worker(0,"Jack",18,184);

        assertTrue(company.recruit(worker,actual));
    }








}
