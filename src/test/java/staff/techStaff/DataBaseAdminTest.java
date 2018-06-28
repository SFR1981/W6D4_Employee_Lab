package staff.techStaff;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DataBaseAdminTest {

    DataBaseAdmin dataBaseAdmin;

    @Before
    public void before() {
        dataBaseAdmin = new DataBaseAdmin("Terry Wogan", "JL150134C", 25000);
    }


    @Test
    public void getName() {
        assertEquals("Terry Wogan", dataBaseAdmin.getName());
    }

    @Test
    public void getNiNumber() {
        assertEquals("JL150134C", dataBaseAdmin.getNiNumber());
    }

    @Test
    public void getSalary() {
        assertEquals(25000, dataBaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void raiseSalary() {
        dataBaseAdmin.raiseSalary(100);
        assertEquals(25100, dataBaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void payBonus() {
        assertEquals(250, dataBaseAdmin.payBonus(), 0.01);
    }
}
