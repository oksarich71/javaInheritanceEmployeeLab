import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Management.Director director;

    @Before
    public void before(){
        director = new Management.Director("Bill Gales", 75000.00, "NP67854", 2000000.00);
    }
    @Test
    public void canGetBudget(){
        assertEquals(2000000.00, director.getBudget(), 0.01);
    }
    @Test
    public void canGetName(){
        assertEquals("Bill Gales", director.getName());
    }
    @Test
    public void canGetSalary(){
        assertEquals(75000.00, director.getSalary(), 0.01);
    }
    @Test
    public void canGetNumberNI(){
        assertEquals("NP67854", director.getNumberNI());
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(85000.00, director.raiseSalary(10000.00), 0.01);
    }
    @Test
    public void canGetBonus(){
        assertEquals(1500.00, director.payBonus(), 0.01);
    }
}
