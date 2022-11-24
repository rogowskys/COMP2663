/**
 * Creates and stores customer accounts.
 */
public class account {

	private int accountID = 100;
	private String customerName;
	private String customerAddress;
	private String customerPhoneNumber;
	private double accountBalance = 0.00;

	public account(String customerName, String customerAddress, String customerPhoneNumber, int nextAccountID) {
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerPhoneNumber = customerPhoneNumber;
		accountID += nextAccountID;
	}

	public account() {
	}

	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID += accountID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}

	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String toString() {
		return accountID + "\t\t" + customerName + "\t" + customerPhoneNumber + "\t$" + accountBalance;
	}

}
