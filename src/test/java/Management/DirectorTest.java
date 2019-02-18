package Management;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class DirectorTest {

    Director director;

    @Before

    public void before(){
        director = new Director("Dave", "jkbfsd", 350000, "Coffee", 1000000);
    }

    @Test

    public void canGetName(){
        assertEquals("Dave", director.getName());
    }

    @Test
    public void canGetNationalInsurance(){
        assertEquals("jkbfsd", director.getNationalInsurance());
    }

    @Test
    public void canGetSalary(){
        assertEquals(350000.0, director.getSalary());
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Coffee", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(125);
        assertEquals(350125.0, director.getSalary());
    }

    @Test
    public void canGetBonus(){
        assertEquals(3500.0, director.payBonus());
    }

    @Test
    public void canGetBudget(){
        assertEquals(1000000.0, director.getBudget());
    }
}
