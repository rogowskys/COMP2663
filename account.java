/**
 * Creates and stores customer accounts.
 */
public class account {

	private static int accountID = 100;
	private static String customerName;
	private static String customerAddress;
	private static String customerPhoneNumber;
	private static double accountBalance = 0.00;

	public account(String customerName, String customerAddress, String customerPhoneNumber, int nextAccountID) {
		account.customerName = customerName;
		account.customerAddress = customerAddress;
		account.customerPhoneNumber = customerPhoneNumber;
		account.accountID += nextAccountID;
	}

	public account() {
	}

	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		account.accountID = accountID;
	}

	public static String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		account.customerName = customerName;
	}

	public static String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		account.customerAddress = customerAddress;
	}

	public static String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}

	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		account.customerPhoneNumber = customerPhoneNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		account.accountBalance = accountBalance;
	}

	public String toString() {
		return accountID + "\t\t" + customerName + "\t" + customerPhoneNumber + "\t$" + accountBalance;
	}


}
