import java.util.Scanner;
import java.util.ArrayList;

/**
 * Manages the transactions.
 */
public class transactionManagement {

    private static transaction newTransaction;
    private static Scanner scan = new Scanner(System.in);
    private static String menuOption = "";
    private static account transactionCustomer;

    /**
     * Allows a new transaction to be made via a menu.
     *
     * @param transactionRegister transaction in progress
     */
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
                        processPayment();
                        transactionRegister.add(newTransaction);
                    }
                    return;
                default:
                    System.out.println("Invalid Selection\n");
                    break;
            }
        } while (!menuOption.equals("B"));
    }

    /**
     * Allows a new transaction to be created.
     */
    static void createNewTransaction() {
        // Find the customer first to associate to the transaction
        transactionCustomer = accountManagement.findCustomerAccount(posTerminal.customerAccounts, scan);
        // Instantiate a new transaction
        newTransaction = new transaction(transactionCustomer);
        addCustomerBalance();
    }

    /**
     * Allows for options in transaction to be completed.
     * Options include: Add, Remove, Void, and Complete.
     */
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
                    processPayment();
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
                    .addNewLineItem(new Item("Account Fees", 0, transactionCustomer.getAccountBalance(), 0), 1);
        }
    }

    /**
     * Adds a new item to transaction.
     */
    static void addNewLineItem() {
        int UPC;
        Item lineItem;
        int quantity;

        System.out.println("Enter/Scan UPC:");
        UPC = scan.nextInt();
        System.out.println("Beep");
        System.out.println("Enter Quantity:");
        quantity = scan.nextInt();
        // Scan through media inventory first
        for (int i = 0; i < posTerminal.mediaInventory.size(); i++) {
            lineItem = posTerminal.mediaInventory.get(i);
            if (UPC == lineItem.getUPC()) {
                newTransaction.addNewLineItem(lineItem, quantity);
                System.out.println(lineItem.getDescription() + " Added");
                return;
            }
        }
        // Then scan through non-media inventory. Boy I wish I would have made them the
        // same type at this point.
        for (int i = 0; i < posTerminal.inventory.size(); i++) {
            lineItem = posTerminal.inventory.get(i);
            if (UPC == lineItem.getUPC()) {
                newTransaction.addNewLineItem(lineItem, quantity);
                System.out.println(lineItem.getDescription() + " Added");
                return;
            }
        }
    }

    /**
     * Removes an item from the transaction.
     */
    static void removeLineItem(int lineNumber) {
        newTransaction.removeLineItem(lineNumber);
    }

    /**
     * Processes the payment by the customer.
     * 
     * @param d amount due by customer to be processed
     */
    static void processPayment() {
        int menuOption;
        boolean paymentMade = false;

        System.out.println("\nSelect Payment Method:");
        System.out.println("\n1 - Cash, 2 - Debit Card, 3 - Credit Card");
        menuOption = scan.nextInt();
        do {
            switch (menuOption) {
                case 1:
                    newTransaction.setCustomerPayment(new Payment(newTransaction.getTotal(), paymentType.cash));
                    paymentMade = true;
                    break;
                case 2:
                    newTransaction.setCustomerPayment(new Payment(newTransaction.getTotal(), paymentType.debitCard));
                    paymentMade = true;
                    break;
                case 3:
                    newTransaction.setCustomerPayment(new Payment(newTransaction.getTotal(), paymentType.creditCard));
                    paymentMade = true;
                    break;
                default:
                    System.out.println("Invalid Selection\n");
                    break;
            }
        } while (!paymentMade);
    }

    /**
     * null out the new transaction object for the garbage collector
     */
    static void terminateTransaction() {
        newTransaction = null;
    }
}
