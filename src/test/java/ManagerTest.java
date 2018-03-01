import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Brian", "JF768893R", 40000.00, "CMNH");
    }



    @Test
    public void hasDeptName() {
        assertEquals("CMNH", manager.getDeptName());
    }



}
