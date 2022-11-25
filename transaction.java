/**
 * (Write a succinct description of this class here. You should avoid
 * wordiness and redundancy. )
 *
 * Bugs: (a list of bugs and other problems)
 * 
 * @author Kylie DeViller (162298d) <162298d@ACADIAU.CA>; and Sean Rogowsky (134715r) 134715r@ACADIAU.CA> 
 */

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class transaction {

	final double TAXRATE = 0.15;

	private ArrayList<transactionLineItem> transactionLineItems = new ArrayList<>();
	private account customerAccount;
	private double subTotal;
	private double taxes;
	private double total;
	private LocalDate date;
	private LocalTime time;
	private Payment customerPayment;

	DecimalFormat dfrmt = new DecimalFormat("#.##");

	public transaction(account customerAccount) {
		this.customerAccount = customerAccount;
		date = LocalDate.now();
		time = LocalTime.now();
	}

	public void addNewLineItem(Item newLineItem, int quantity) {
		transactionLineItems.add(new transactionLineItem(newLineItem, quantity));
		updateTotals();
	}

	public void removeLineItem(int index) {
		transactionLineItems.remove(index);
		updateTotals();
		System.out.println("Line " + index + " removed.");
	}

	/**
	 * Zero out the dollar ammounts and iterate through each line item to determine
	 * the new dollar values for the totals and taxes.
	 */
	public void updateTotals() {
		subTotal = taxes = total = 0;
		for (int i = 0; i < transactionLineItems.size(); i++) {
			subTotal += (transactionLineItems.get(i).getTransactionLineItem().getPrice() *
					transactionLineItems.get(i).getQuantity());
		}
		taxes = subTotal * TAXRATE;
		total = subTotal + taxes;
	}

	public Item getLineItem(int index) {
		transactionLineItem lineToReturn = transactionLineItems.get(index);
		Item itemToReturn = lineToReturn.getTransactionLineItem();
		return itemToReturn;
	}

	public transactionLineItem getTransactionLineItems(int index) {
		return transactionLineItems.get(index);
	}

	public double getSubTotal() {
		return subTotal;
	}

	public double getTaxes() {
		return taxes;
	}

	public double getTotal() {
		return total;
	}

	public LocalDate getDate() {
		return date;
	}

	public LocalTime getTime() {
		return time;
	}

	public Payment getCustomerPayment() {
		return customerPayment;
	}

	public void setCustomerPayment(Payment customerPayment) {
		this.customerPayment = customerPayment;
	}

	@Override
	public String toString() {
		String transactionPrintout = "";

		transactionPrintout += "\n\nTransaction for Customer: " + customerAccount.getCustomerName();
		transactionPrintout += "\nDate: " + date + " Time: " + time;
		transactionPrintout += "\n\n";
		transactionPrintout += "#\tDescription/Title\tQuantity\tTotal\tDue Date\n";
		// Dear god I hope this works.
		for (int i = 0; i < transactionLineItems.size(); i++) {
			transactionPrintout += i + "\t" +
					getLineItem(i).description + "\t\t" + getTransactionLineItems(i).getQuantity() +
					"\t\t$" + getLineItem(i).getPrice() * getTransactionLineItems(i).getQuantity() +
					"\t";
			if (getLineItem(i) instanceof mediaItem) {
				transactionPrintout += ((mediaItem) getLineItem(i)).getRentalLength() + " Days";
			}
			transactionPrintout += "\n";
		}
		transactionPrintout += "\n\nSubtotal: $" + dfrmt.format(subTotal) + "\n";
		transactionPrintout += "Taxes: $" + dfrmt.format(taxes) + "\n";
		transactionPrintout += "Total: $" + dfrmt.format(total) + "\n";

		if (customerPayment != null) {
			transactionPrintout += "Payment Made: " + dfrmt.format(customerPayment.amount) + "\n";
			transactionPrintout += "Payment Type: " + customerPayment.paymentMethod + "\n";
		}

		return transactionPrintout;
	}

}
