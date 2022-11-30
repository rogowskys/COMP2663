
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

import posPackage.*;

public class accountTest {
    private Account testAccount;

    @Before
    public void setUp() {
        testAccount = new Account("Homer Simpson", "742 Evergreen Terrace", "867-5309", 100);
    }

    @Test
    public void testGetAccountBalance() {
        double testBalance = testAccount.getAccountBalance();
        double expectedBalance = 0.00;
        boolean result = false;
        if (expectedBalance == testBalance) {
            result = true;
        }
        assertTrue(result);
    }

    @Test
    public void testGetAccountID() {
        boolean result = false;
        int actual = testAccount.getAccountID();
        int expected = 200;
        if (actual == expected) {
            result = true;
        }
        assertTrue(result);
    }

    @Test
    public void testGetCustomerAddress() {
        String actual = testAccount.getCustomerAddress();
        String expected = "742 Evergreen Terrace";
        assertTrue(actual.equals(expected));
    }

    @Test
    public void testGetCustomerName() {
        String actual = testAccount.getCustomerName();
        String expected = "Homer Simpson";
        assertTrue(actual.equals(expected));
    }

    @Test
    public void testGetCustomerPhoneNumber() {
        String actual = testAccount.getCustomerPhoneNumber();
        String expected = "867-5309";
        assertTrue(actual.equals(expected));
    }

    @Test
    public void testSetAccountBalance() {
        boolean result = false;
        double expected = 4.99;
        testAccount.setAccountBalance(expected);
        if (testAccount.getAccountBalance() == expected) {
            result = true;
        }
        assertTrue(result);
    }

    @Test
    public void testSetAccountID() {
        boolean result = false;
        int expectedID = 201;
        testAccount.setAccountID(1);
        if (testAccount.getAccountID() == expectedID) {
            result = true;
        }
        assertTrue(result);
    }

    @Test
    public void testSetCustomerAddress() {
        String expected = "123 Fake St";
        testAccount.setCustomerAddress(expected);
        assertTrue(testAccount.getCustomerAddress().equals(expected));
    }

    @Test
    public void testSetCustomerName() {
        String expected = "Krusty The Clown";
        testAccount.setCustomerName(expected);
        assertTrue(testAccount.getCustomerName().equals(expected));
    }

    @Test
    public void testSetCustomerPhoneNumber() {
        String expected = "555-3226";
        testAccount.setCustomerPhoneNumber(expected);
        assertTrue(testAccount.getCustomerPhoneNumber().equals(expected));
    }

    @Test
    public void testToString() {
        String expected = "201\t\tKrusty The Clown\t555-3226\t$4.99";
        assertTrue(testAccount.toString().equals(expected));
    }
}
