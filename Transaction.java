import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class transaction {

	final double TAXRATE = 0.15;

	private ArrayList<Item> transactionLineItems = new ArrayList<>();
	private double subTotal;
	private double taxes;
	private double total;
	private LocalDate date;
	private LocalTime time;

	public transaction() {
		date = LocalDate.now();
		time = LocalTime.now();
	}

	public void addNewLineItem(Item newLineItem) {
		transactionLineItems.add(newLineItem);
		subTotal += newLineItem.getPrice();
		taxes = subTotal * TAXRATE;
		total = subTotal + taxes;
	}

	public ArrayList<Item> getTransactionLineItems(int index) {
		return transactionLineItems;
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

}