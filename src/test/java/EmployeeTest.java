import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Manager manager;
    Developer developer;
    DatabaseAdmin databaseAdmin;
    Director director;

    @Before
    public void before(){
        manager = new Manager("Brian", "JF768893R", 40000.00, "CMNH");
        developer = new Developer("Ellie", "GS485423B", 30000.00);
        databaseAdmin = new DatabaseAdmin("Greig", "TH495372C", 25000.00);
        director = new Director("Fulcher", "KR694371F", 70000.00, "Decedent Receiving", 1000000);
    }


    @Test
    public void hasName(){
        assertEquals("Brian", manager.getName());
        assertEquals("Ellie", developer.getName());
        assertEquals("Greig", databaseAdmin.getName());
        assertEquals("Fulcher", director.getName());
    }

    @Test
    public void canSetName() {
        director.setName("Ian");
        assertEquals("Ian", director.getName());
        developer.setName("");
        assertEquals("Ellie", developer.getName());
    }

    @Test
    public void hasNi(){
        assertEquals("JF768893R", manager.getNi());
        assertEquals("GS485423B", developer.getNi());
        assertEquals("TH495372C", databaseAdmin.getNi());
        assertEquals("KR694371F", director.getNi());
    }

    @Test
    public void hasSalary() {
        assertEquals(40000.00, manager.getSalary(), 0.01);
        assertEquals(30000.00, developer.getSalary(), 0.01);
        assertEquals(25000.00, databaseAdmin.getSalary(), 0.01);
        assertEquals(70000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canApplyRaise() {
        manager.raiseSalary(10000.00);
        developer.raiseSalary(20000.00);
        databaseAdmin.raiseSalary(5000.00);
        director.raiseSalary(-1000.00);
        assertEquals(50000.00, manager.getSalary(), 0.01);
        assertEquals(50000.00, developer.getSalary(), 0.01);
        assertEquals(30000.00, databaseAdmin.getSalary(), 0.01);
        assertEquals(70000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(400.00, manager.payBonus(), 0.01);
        assertEquals(300.00, developer.payBonus(), 0.01);
        assertEquals(250.00, databaseAdmin.payBonus(), 0.01);
    }
}
