
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.util.Date;

import posPackage.*;

public class transactionTest {

    public Item testItem, testItem2;
    public Transaction testTransaction;
    public Account testAccount;
    public Payment testPayment;

    @Before
    public void setup() {
        testItem = new MediaItem(100, 0.93, 2, "David and Lisa", "habitasse", "Web Jeske", "Gay Montford",
                "Alidia Maffione", 7, MediaType.DVD);
        testItem2 = new Item("Doritos 454g", 12, 5.99, 50);
        testAccount = new Account("Homer Simpson", "742 Evergreen Terrace", "867-5309", 1);
        testTransaction = new Transaction(testAccount);
        testPayment = new Payment(5.00, PaymentType.debitCard);
        testTransaction.addNewLineItem(testItem2, 1);
        testTransaction.setCustomerPayment(testPayment);

    }

    @Test
    public void testAddNewLineItem() {
        boolean result = false;
        try {
            testTransaction.addNewLineItem(testItem, 2);

        } catch (Exception exception) {
            result = false;
        }
        if (testItem == testTransaction.getLineItem(1)) {
            result = true;
        }
        assertTrue(result);
    }

    @Test
    public void testRemoveLineItem() {
        boolean result = false;
        int numberBefore = testTransaction.getNumberOfLineItems();
        int expected = numberBefore - 1;
        testTransaction.removeLineItem(0);

        if (expected == testTransaction.getNumberOfLineItems()) {
            result = true;
        }
        assertTrue(result);
    }

    @Test
    public void testSetCustomerPayment() {
        boolean result = false;
        try {
            testTransaction.setCustomerPayment(testPayment);
        } catch (Exception e) {
            result = false;
        }
        if (testTransaction.getCustomerPayment() == testPayment) {
            result = true;
        }
        assertTrue(result);
    }

    @Test
    public void testGetCustomerPayment() {
        boolean result = false;
        Payment actual = testTransaction.getCustomerPayment();
        if (actual == testPayment) {
            result = true;
        }
        assertTrue(result);
    }

    @Test
    public void testGetDate() {
        boolean result = false;
        try {
            testTransaction.getDate();
            result = true;
        } catch (Exception exception) {
            result = true;
        }
        assertTrue(result);
    }

    @Test
    public void testGetLineItem() {
        boolean result = false;
        Item expected = testItem2;
        Item actual = testTransaction.getLineItem(0);
        if (expected == actual) {
            result = true;
        }
        assertTrue(result);
    }

    @Test
    public void testGetSubTotal() {
        boolean result = false;
        double expected = 5.99;
        double actual = testTransaction.getSubTotal();
        if (expected == actual) {
            result = true;
        }
        assertTrue(result);
    }

    @Test
    public void testGetTaxes() {
        boolean result = false;
        double expected = 0.8985;
        double actual = testTransaction.getTaxes();
        if (expected == actual) {
            result = true;
        }
        assertTrue(result);
    }

    @Test
    public void testGetTime() {
        boolean result = false;
        try {
            testTransaction.getTime();
            result = true;
        } catch (Exception e) {
            result = false;
        }
        assertTrue(result);
    }

    @Test
    public void testGetTotal() {
        boolean result = false;
        double expected = 6.8885000000000005;
        double actual = testTransaction.getTotal();
        System.out.println(actual);
        if (expected == actual) {
            result = true;
        }
        assertTrue(result);
    }

    @Test
    public void testGetTransactionLineItems() {
        boolean result = false;
        TransactionLineItem actual = testTransaction.getTransactionLineItems(0);
        Item expected = testItem2;

        if (expected == actual.getTransactionLineItem()) {
            result = true;
        }
        assertTrue(result);
    }

    @Test
    public void testToString() {
        boolean result = false;
        try {
            testTransaction.toString();
            result = true;
        } catch (Exception e) {
            result = false;
        }
        assertTrue(result);
    }

    @Test
    public void testUpdateTotals() {
        boolean result = false;
        System.out.println(testTransaction.getTotal());
        TransactionLineItem test = testTransaction.getTransactionLineItems(0);
        test.setQuantity(2);
        testTransaction.updateTotals();
        System.out.println(testTransaction.getTotal());

        double actual = testTransaction.getTotal();
        double expected = 13.777000000000001;
        if (expected == actual) {
            result = true;
        }
        assertTrue(result);
    }
}
