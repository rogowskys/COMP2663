
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

import posPackage.*;

public class PaymentTest {

    Payment testPayment;

    @Before
    public void setup() {
        testPayment = new Payment(123.45, paymentType.creditCard);
    }

    @Test
    public void testGetAmount() {

    }

    @Test
    public void testGetPaymentMethod() {

    }

    @Test
    public void testSetAmount() {

    }

    @Test
    public void testSetPaymentMethod() {

    }
}
