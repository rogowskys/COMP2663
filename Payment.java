/**
 * Allows for a payment to be processed
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