
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

import posPackage.*;

public class transactionTest {

    public Item testItem, testItem2;
    public Transaction testTransaction;
    public Account testAccount;

    @Before
    public void setup() {
        testItem = new MediaItem(100, 0.93, 2, "David and Lisa", "habitasse", "Web Jeske", "Gay Montford",
                "Alidia Maffione", 7, MediaType.DVD);
        testItem2 = new Item("Doritos 454g", 12, 5.99, 50);
        testAccount = new Account("Homer Simpson", "742 Evergreen Terrace", "867-5309", 1);
        testTransaction = new Transaction(testAccount);
    }

    @Test
    public void testAddNewLineItem() {
        boolean result = false;
        try {
            testTransaction.addNewLineItem(testItem, 2);
        } catch (Exception exception) {
            result = false;
        }
        if (testItem == testTransaction.getLineItem(0)) {
            result = true;
        }
        assertTrue(result);
    }

    @Test
    public void testRemoveLineItem() {

    }


    @Test
    public void testSetCustomerPayment() {

    }

    @Test
    public void testGetCustomerPayment() {

    }

    @Test
    public void testGetDate() {

    }

    @Test
    public void testGetLineItem() {

    }

    @Test
    public void testGetSubTotal() {

    }

    @Test
    public void testGetTaxes() {

    }

    @Test
    public void testGetTime() {

    }

    @Test
    public void testGetTotal() {

    }

    @Test
    public void testGetTransactionLineItems() {

    }

   


    @Test
    public void testToString() {

    }

    @Test
    public void testUpdateTotals() {

    }
}
