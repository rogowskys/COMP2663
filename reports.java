import java.util.ArrayList;

public class reports {

	public void listTransactions() {
		// TODO - implement reports.listTransactions
		throw new UnsupportedOperationException();
	}

	public void listAccounts() {
		// TODO - implement reports.listAccounts
		throw new UnsupportedOperationException();
	}

	public static void listInventory(ArrayList inventoryToPrint) {
		System.out.println("\n\nNon-media Inventory:");
		System.out.println("Description\tPrice\tOn Hand\tUPC");
		for (int j = 0; j < 3; j++) {
			System.out.println(inventoryToPrint.get(j));
		}
	}

	public static void listMediaInventory(ArrayList inventoryToPrint) {
		System.out.println("\n\nMedia Inventory:");
		System.out.println("Title\t\t\t\tUPC\t\tPrice\tType");
		for (int i = 0; i < 4; i++) {
			System.out.println(inventoryToPrint.get(i));
		}
	}

}