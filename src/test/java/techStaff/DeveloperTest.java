package techStaff;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class DeveloperTest {

    Developer developer;

    @Before

    public void before(){
        developer = new Developer("Dave", "erthl", 25000);
    }

    @Test
    public void canGetName(){
        assertEquals("Dave", developer.getName());
    }
    @Test
    public void canGetNationalInsurace(){
        assertEquals("erthl", developer.getNationalInsurance());
    }
    @Test
    public void canGetSalary(){
        assertEquals(25000.0, developer.getSalary());
    }
    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(1000);
        assertEquals(26000.0, developer.getSalary());
    }
    public void canGetBonus(){
        assertEquals(250.0, developer.payBonus());
    }
}
