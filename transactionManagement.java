import java.util.Scanner;
import java.util.ArrayList;

public class transactionManagement {

    private static transaction newTransaction;
    private static Scanner scan = new Scanner(System.in);
    private static String menuOption = "";
    private static account transactionCustomer;

    public static void transactionManagementMenu(ArrayList<transaction> transactionRegister) {

        do {
            System.out.println("\n");
            System.out.println("Transaction Menu");
            System.out.println("_______________________\n");
            System.out.println("(C)reate new transaction\n");
            System.out.println("(B)ack");
            System.out.println("Selection:");
            menuOption = scan.nextLine();
            switch (menuOption.trim()) {
                case "C":
                    createNewTransaction();
                    inTransaction();
                    if (newTransaction != null) { // Not voided transaction.
                        processPayment(newTransaction.getTotal());
                        transactionRegister.add(newTransaction);
                    }
                    return;
                default:
                    System.out.println("Invalid Selection\n");
                    break;
            }
        } while (!menuOption.equals("B"));
    }

    static void createNewTransaction() {
        // Find the customer first to associate to the transaction
        transactionCustomer = accountManagement.findCustomerAccount(posTerminal.customerAccounts, scan);
        // Instantiate a new transaction
        newTransaction = new transaction(transactionCustomer);
        addCustomerBalance();
    }

    static void inTransaction() {
        boolean transactionComplete = false;
        int menuOption;

        do {
            System.out.println(newTransaction);
            System.out.println("\n1 - Add Item, 2 - Remove Line, 3 - Void Transaction, 4 - Complete & Process Payment");
            menuOption = scan.nextInt();
            switch (menuOption) {
                case 1:
                    addNewLineItem();
                    break;
                case 2:
                    System.out.println("Which line number?");
                    removeLineItem(scan.nextInt());
                    break;
                case 3:
                    terminateTransaction();
                    transactionComplete = true;
                    return;
                case 4:
                    transactionComplete = true;
                    break;
                default:
                    System.out.println("Invalid Selection\n");
                    break;
            }
        } while (!transactionComplete);
    }

    /**
     * Adds balance to customer's account.
     */
    static void addCustomerBalance() {
        // Check for account fees
        if (transactionCustomer.getAccountBalance() != 0.0) {
            System.out.println("Outstanding account fees found: " + transactionCustomer.getAccountBalance());
            System.out.println("Adding fees to transaction.");
            newTransaction
                    .addNewLineItem(new Item("Account Fees", 0, transactionCustomer.getAccountBalance(), 0));
        }
    }

    /**
     * Adds a new item to transaction.
     */
    static void addNewLineItem() {
        int UPC;
        mediaItem mediaLineItem;
        Item lineItem;

        System.out.println("Enter/Scan UPC:");
        UPC = scan.nextInt();
        System.out.println("Beep");
        // Scan through media inventory first
        for (int i = 0; i < posTerminal.mediaInventory.size(); i++) {
            mediaLineItem = posTerminal.mediaInventory.get(i);
            if (UPC == mediaLineItem.getUPC()) {
                newTransaction.addNewLineItem(mediaLineItem);
                System.out.println(mediaLineItem.getTitle() + " Added");
                return;
            }
        }
        // Then scan through non- media inventory. Boy I wish I would have made them the
        // same type at this point.
        for (int i = 0; i < posTerminal.inventory.size(); i++) {
            lineItem = posTerminal.inventory.get(i);
            if (UPC == lineItem.getUPC()) {
                newTransaction.addNewLineItem(lineItem);
                System.out.println(lineItem.getDescription() + " Added");
                return;
            }
        }

    }

    /**
     * Removes an item from the transaction.
     */
    static void removeLineItem(int lineNumber) {
        // TODO - implement Transaction.removeLineItem
        throw new UnsupportedOperationException();
    }

    /**
     * Processes the payment by the customer.
     * 
     * @param d
     */
    static void processPayment(double d) {
        // TODO - implement Transaction.processPayment
        throw new UnsupportedOperationException();
    }

    static void terminateTransaction() {
        newTransaction = null; // null out the new transaction object for the garbage collector.
        // TODO - other stuff maybe?
    }
}
