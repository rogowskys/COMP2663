/**
 * Creates and stores customer accounts.
 */
public class account {

	private int accountID = 100;
	private String customerName;
	private String customerAddress;
	private String customerPhoneNumber;
	private double accountBalance = 0.00;

	/**
	 * Checks account for reservation.
	 */
	void reservationSearch() {
		// TODO - implement Account.reservationSearch
		throw new UnsupportedOperationException();
	}

	/**
	 * Updates customer's account
	 */
	void updateCustomerAccount() {
		// TODO - implement Account.updateCustomerAccount
		throw new UnsupportedOperationException();
	}

	/**
	 * Searches accounts database for customer.
	 */
	void findCustomerAccount() {
		// TODO - implement Account.findCustomerAccount
		throw new UnsupportedOperationException();
	}

	/**
	 * Creates a new account for a customer.
	 */
	void createCustomerAccount() {
		// TODO - implement Account.createCustomerAccount
		throw new UnsupportedOperationException();
	}

	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
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
		return "";
	}

	public account(String customerName, String customerAddress, String customerPhoneNumber) {
		this.accountID++;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerPhoneNumber = customerPhoneNumber;
	}

}
