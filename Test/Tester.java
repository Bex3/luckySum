import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by bearden-tellez on 9/21/16.
 */
public class Tester {
    LuckySumSolver solver;

    @Before
    public void setUp() throws Exception {
        solver = new LuckySumSolver();
    }

    @After
    public void tearDown() throws Exception {

    }
    @Test
    public void testFirstNumber() throws Exception {
        int thisTest = solver.luckySum(13, 5, 5);
        assertEquals(thisTest, 0);
    }
    @Test
    public void testSecondNumber() throws Exception {
        int thisTest = solver.luckySum(20, 13, 5);
        assertEquals(thisTest, 20);
    }
    @Test
    public void testThirdNumber() throws Exception {
        int thisTest = solver.luckySum(45, 33, 13);
        assertEquals(thisTest, 78);
    }

}
