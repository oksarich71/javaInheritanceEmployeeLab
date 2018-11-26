import TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Jack White", 25000.00, "NP56784");
    }

    @Test
    public void canGetName(){
        assertEquals("Jack White", databaseAdmin.getName());
    }
    @Test
    public void canGetSalary(){
        assertEquals(25000, databaseAdmin.getSalary(), 0.01);
    }
    @Test
    public void canGetNumberNI(){
        assertEquals("NP56784", databaseAdmin.getNumberNI());
    }
    @Test
    public void canRaiseSalary(){
        assertEquals(27000.00, databaseAdmin.raiseSalary(2000.00), 0.01);
    }
    @Test
    public void canGetBonus(){
        assertEquals(250.00, databaseAdmin.payBonus(), 0.01);
    }
}
