import Management.Manager;
import Staff.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {
    Employee employee;

    @Before
    public void before(){
        employee = new Employee("Jack Green", 28000.00, "NP06789");
    }

    @Test
    public void canGetName(){
        assertEquals("Jack Green", employee.getName());
    }
    @Test
    public void canGetSalary(){
        assertEquals(28000.00, employee.getSalary(), 0.01);
    }
    @Test
    public void canGetNumberNI(){
        assertEquals("NP06789", employee.getNumberNI());
    }
    @Test
    public void canGetDepName(){
        employee = new Management.Manager("Finance", "Ollie Broon", 35000.00, "NP67856");
        assertEquals("Finance", ((Manager) employee).getDepName());
    }
    @Test
    public void canRaiseSalary(){
        assertEquals(35000.00, employee.raiseSalary(7000.00), 0.01);
    }
    @Test
    public void canGetBonus(){
        assertEquals(280, employee.payBonus(), 0.01);
    }


}
