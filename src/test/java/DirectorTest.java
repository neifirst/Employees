import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Fulcher", "KR694371F", 70000.00, "Decedent Receiving", 1000000);
    }

    @Test
    public void hasBudget() {
        assertEquals(1000000, director.getBudget(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(1400.00, director.payBonus(), 0.01);
    }
}
