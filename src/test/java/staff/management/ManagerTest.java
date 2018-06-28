package staff.management;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Terry Wogan", "JL150134C", 25000, "Quiz Shows");
    }

    @Test
    public void getDepartment() {
        assertEquals("Quiz Shows", manager.getDepartment());
    }

    @Test
    public void getName() {
        assertEquals("Terry Wogan", manager.getName());
    }

    @Test
    public void getNiNumber() {
        assertEquals("JL150134C", manager.getNiNumber());
    }

    @Test
    public void getSalary() {
        assertEquals(25000, manager.getSalary(), 0.01);
    }

    @Test
    public void raiseSalary() {
        manager.raiseSalary(100);
        assertEquals(25100, manager.getSalary(), 0.01);
    }

    @Test
    public void payBonus() {
        assertEquals(250, manager.payBonus(),0.01);
    }

    @Test
    public void changeName(){
        manager.setName("Terry Nutkins");
        assertEquals("Terry Nutkins", manager.getName());
    }

    @Test
    public void dontChangeNameNull(){
        manager.setName(null);
        assertEquals("Terry Wogan", manager.getName());
    }

    @Test
    public void cantDecreaseSalary(){
        manager.raiseSalary(-2500);
        assertEquals(25000, manager.getSalary(), 0.01);
    }
}