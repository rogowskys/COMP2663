/**
 * Payment class allows the payment of a transaction to be processed.
 *
 * Bugs: None that we are aware of.
 * 
 * @author Kylie DeViller (162298d) <162298d@ACADIAU.CA>; and Sean Rogowsky (134715r) 134715r@ACADIAU.CA> 
 */
package posPackage;

public class Payment {

	double amount;
	PaymentType paymentMethod;

	private void openDrawer() {
		System.out.println("--- Beep Boop.. Cash Drawer Opened ---\n");
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public PaymentType getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(PaymentType paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	/**
	 * Processes the amount and type of payment for this transaction's payment.
	 *
	 * @param amount amount due by customer for this transaction
	 * @param paymentMethod method of payment for this transaction
	 */
	public Payment(double amount, PaymentType paymentMethod) {
		this.amount = amount;
		this.paymentMethod = paymentMethod;
		if (paymentMethod == PaymentType.cash){
			openDrawer();
		}
	}

}