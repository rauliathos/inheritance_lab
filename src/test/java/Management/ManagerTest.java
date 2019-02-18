package Management;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
       manager = new Manager("Bob", "skgjdfhsdlk4j", 125000, "Haberdashery");
    }

    @Test

    public void canGetName(){
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void canGetNationalInsurance(){
        assertEquals("skgjdfhsdlk4j", manager.getNationalInsurance());
    }

    @Test
    public void canGetSalary(){
        assertEquals(125000.0, manager.getSalary());
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Haberdashery", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(125);
        assertEquals(125125.0, manager.getSalary());
    }

    @Test
    public void canGetBonus(){
        assertEquals(1250.0, manager.payBonus());
    }
}
