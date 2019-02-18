package techStaff;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before

    public void before(){
        databaseAdmin = new DatabaseAdmin("Dave", "erthl", 25000);
    }

    @Test
    public void canGetName(){
        assertEquals("Dave", databaseAdmin.getName());
    }
    @Test
    public void canGetNationalInsurace(){
        assertEquals("erthl", databaseAdmin.getNationalInsurance());
    }
    @Test
    public void canGetSalary(){
        assertEquals(25000.0, databaseAdmin.getSalary());
    }
    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(1000);
        assertEquals(26000.0, databaseAdmin.getSalary());
    }
    public void canGetBonus(){
        assertEquals(250.0, databaseAdmin.payBonus());
    }
}
