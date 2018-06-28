package staff.techStaff;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Terry Wogan", "JL150134C", 25000);
    }


    @Test
    public void getName() {
        assertEquals("Terry Wogan", developer.getName());
    }

    @Test
    public void getNiNumber() {
        assertEquals("JL150134C", developer.getNiNumber());
    }

    @Test
    public void getSalary() {
        assertEquals(25000, developer.getSalary(), 0.01);
    }

    @Test
    public void raiseSalary() {
        developer.raiseSalary(100);
        assertEquals(25100, developer.getSalary(), 0.01);
    }

    @Test
    public void payBonus() {
        assertEquals(250, developer.payBonus(), 0.01);
    }
}
