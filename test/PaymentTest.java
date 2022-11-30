
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

import posPackage.*;

public class PaymentTest {

    Payment testPayment;

    @Before
    public void setup() {
        testPayment = new Payment(123.45, PaymentType.creditCard);
    }

    @Test
    public void testGetAmount() {
        boolean result = false;
        double expected = 123.45;
        if (testPayment.getAmount() == expected) {
            result = true;
        }
        assertTrue(result);
    }

    @Test
    public void testGetPaymentMethod() {
        boolean result = false;
        PaymentType expected = PaymentType.creditCard;
        if (expected == testPayment.getPaymentMethod()) {
            result = true;
        }
        assertTrue(result);
    }

    @Test
    public void testSetAmount() {
        boolean result = false;
        testPayment.setAmount(9.99);
        if (testPayment.getAmount() == 9.99){
            result = true;
        }
        assertTrue(result);
    }

    @Test
    public void testSetPaymentMethod() {
        boolean result = false;
        testPayment.setPaymentMethod(PaymentType.cash);
        if (testPayment.getPaymentMethod() == PaymentType.cash){
            result = true;
        }
        assertTrue(result);
    }
}
