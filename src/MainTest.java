import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testTwoRealRoots() {
        double[] expected = {2.0, 1.0};
        double[] result = Main.solveEquation(1, -3, 2);
        assertNotNull(result);
        assertEquals(2, result.length);
        assertArrayEquals(expected, result, 1e-9);
    }

    @Test
    void testOneRealRoot() {
        double[] expected = {1.0};
        double[] result = Main.solveEquation(1, -2, 1);
        assertNotNull(result);
        assertEquals(1, result.length);
        assertArrayEquals(expected, result, 1e-9);
    }



}
