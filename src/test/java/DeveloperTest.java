import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    TechStaff.Developer developer;
    @Before
    public void before(){
        developer = new TechStaff.Developer("Ollie Brown", 32000.00, "NP67890");
    }

    @Test
    public void canGetName(){
        assertEquals("Ollie Brown", developer.getName());
    }
    @Test
    public void canGetSalary(){
        assertEquals(32000, developer.getSalary(), 0.01);
    }
    @Test
    public void canGetNumberNI(){
        assertEquals("NP67890", developer.getNumberNI());
    }
    @Test
    public void canRaiseSalary(){
        assertEquals(35000.00, developer.raiseSalary(3000.00), 0.01);
    }
    @Test
    public void canGetBonus(){
        assertEquals(320.00, developer.payBonus(), 0.01);
    }
}
