
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class testTest {

    public static void main(String[] args) {

    }

    @Test
    public void shouldFailTestTest() {
        String actual = "";
        String expected = "fail";
        assertTrue(actual.equals(expected));
    }

    @Test
    public void shouldPassTestTest() {
        String actual = "pass";
        String expected = "pass";
        assertTrue(actual.equals(expected));
    }

}
