/**
 * Transaction class calculates the price of transaction when items are added or removed.
 *
 * Bugs: None that we are aware of.
 * 
 * @author Kylie DeViller (162298d) <162298d@ACADIAU.CA>; and Sean Rogowsky (134715r) 134715r@ACADIAU.CA> 
 */
package posPackage;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Transaction {

	final double TAXRATE = 0.15;

	private ArrayList<TransactionLineItem> transactionLineItems = new ArrayList<>();
	private Account customerAccount;
	private double subTotal;
	private double taxes;
	private double total;
	private LocalDate date;
	private LocalTime time;
	private Payment customerPayment;

	DecimalFormat dfrmt = new DecimalFormat("#.##");

	/**
	 * Adds customer's account to the current transaction.
	 *
	 * @param customerAccount account for this customer
	 */
	public Transaction(Account customerAccount) {
		this.customerAccount = customerAccount;
		date = LocalDate.now();
		time = LocalTime.now();
	}

	/**
	 * Add new item to transaction.
	 *
	 * @param newLineItem item to add to transaction
	 * @param quantity    quantity of item
	 */
	public void addNewLineItem(Item newLineItem, int quantity) {
		transactionLineItems.add(new TransactionLineItem(newLineItem, quantity));
		updateTotals();
	}

	/**
	 * Removes unwanted item from transaction.
	 *
	 * @param index line that item is to be removed from
	 */
	public void removeLineItem(int index) {
		transactionLineItems.remove(index);
		updateTotals();
		System.out.println("Line " + index + " removed.");
	}

	/**
	 * Zero out the dollar amounts and iterate through each line item to determine
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
		TransactionLineItem lineToReturn = transactionLineItems.get(index);
		Item itemToReturn = lineToReturn.getTransactionLineItem();
		return itemToReturn;
	}

	public TransactionLineItem getTransactionLineItems(int index) {
		return transactionLineItems.get(index);
	}

	public int getNumberOfLineItems() {
		return transactionLineItems.size();
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
			if (getLineItem(i) instanceof MediaItem) {
				transactionPrintout += ((MediaItem) getLineItem(i)).getRentalLength() + " Days";
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
