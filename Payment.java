/**
 * (Write a succinct description of this class here. You should avoid
 * wordiness and redundancy. )
 *
 * Bugs: (a list of bugs and other problems)
 * 
 * @author Kylie DeViller (162298d) <162298d@ACADIAU.CA>; and Sean Rogowsky (134715r) 134715r@ACADIAU.CA> 
 */

public class Payment {

	double amount;
	paymentType paymentMethod;

	private void openDrawer() {
		System.out.println("--- Beep Boop.. Cash Drawer Opened ---\n");
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public paymentType getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(paymentType paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public Payment(double amount, paymentType paymentMethod) {
		this.amount = amount;
		this.paymentMethod = paymentMethod;
		if (paymentMethod == paymentType.cash){
			openDrawer();
		}
	}

}