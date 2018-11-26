import Management.Manager;
import Staff.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Management.Manager manager;

    @Before
    public void before(){
        manager = new Manager("Finance", "Peter Krill", 38000.00, "NP56784");
    }

    @Test
    public void canGetName(){
        assertEquals("Peter Krill", manager.getName());
    }
    @Test
    public void canGetSalary(){
        assertEquals(38000.00, manager.getSalary(), 0.01);
    }
    @Test
    public void canGetNumberNI(){
        assertEquals("NP56784", manager.getNumberNI());
    }
    @Test
    public void canGetDepName(){
        assertEquals("Finance", manager.getDepName());
    }
    @Test
    public void canRaiseSalary(){
        assertEquals(45000.00, manager.raiseSalary(7000.00), 0.01);
    }
    @Test
    public void canGetBonus(){
        assertEquals(380, manager.payBonus(), 0.01);
    }

}
