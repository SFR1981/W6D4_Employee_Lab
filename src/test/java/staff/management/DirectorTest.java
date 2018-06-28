package staff.management;



import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Terry Wogan", "JL150134C", 25000, "Quiz Shows", 1000000);
    }

    @Test
    public void getDepartment() {
        assertEquals("Quiz Shows", director.getDepartment());
    }

    @Test
    public void getName() {
        assertEquals("Terry Wogan", director.getName());
    }

    @Test
    public void getNiNumber() {
        assertEquals("JL150134C", director.getNiNumber());
    }

    @Test
    public void getSalary() {
        assertEquals(25000, director.getSalary(), 0.01);
    }

    @Test
    public void raiseSalary() {
        director.raiseSalary(100);
        assertEquals(25100, director.getSalary(), 0.01);
    }

    @Test
    public void payBonus() {
        assertEquals(500, director.payBonus(),0.01);
    }

    @Test
    public void getBudget() {
        assertEquals(1000000, director.getBudget(), 0.01);
    }



}