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

	DecimalFormat dfrmt = new DecimalFormat("#.##");

	public transaction(account customerAccount) {
		this.customerAccount = customerAccount;
		date = LocalDate.now();
		time = LocalTime.now();
	}

	public void addNewLineItem(Item newLineItem, int quantity) {
		transactionLineItems.add(new transactionLineItem(newLineItem, quantity));
		subTotal += (newLineItem.getPrice() * quantity);
		taxes = subTotal * TAXRATE;
		total = subTotal + taxes;
	}

	public void removeLineItem(int index) {
		transactionLineItems.remove(index);
		System.out.println("Line " + index + " removed.");
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

	@Override
	public String toString() {
		String transactionPrintout = "";

		transactionPrintout += "\n\nTransaction for Customer: " + customerAccount.getCustomerName();
		transactionPrintout += "\nDate: " + date + " Time: " + time;
		transactionPrintout += "\n\n";
		transactionPrintout += "#\tDescription/Title\tQuantity\tTotal\tDue Date\n";
		//Dear god I hope this works.
		for (int i = 0; i < transactionLineItems.size(); i++) {
			transactionPrintout += i + "\t" +
					getLineItem(i).description + "\t\t" + getTransactionLineItems(i).getQuantity() +
					"\t\t" + getLineItem(i).getPrice() * getTransactionLineItems(i).getQuantity() + 
					"\t" + "TODO\n";
		}
		transactionPrintout += "\n\nSubtotal: $" + dfrmt.format(subTotal) + "\n";
		transactionPrintout += "Taxes: $" + dfrmt.format(taxes) + "\n";
		transactionPrintout += "Total: $" + dfrmt.format(total) + "\n";


		return transactionPrintout;
	}

}
