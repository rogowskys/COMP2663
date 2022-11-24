import java.util.Scanner;
import java.util.ArrayList;

public class transactionManagement {

    private transaction newTransaction;
    private static Scanner scan = new Scanner(System.in);
    private static String menuOption = "";
    private account transactionCustomer;

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
                    break;
                default:
                    System.out.println("Invalid Selection\n");
                    break;
            }
        } while (!menuOption.equals("B"));
    }

    void inTransactionOptions() {

    }

    void createNewTransaction() {
        //Find the customer first to associate to the transaction
        transactionCustomer = accountManagement.findCustomerAccount(posTerminal.customerAccounts, scan);
        // Instantiate a new transaction
        newTransaction = new transaction(transactionCustomer);
        // Check for account fees
        if (transactionCustomer.getAccountBalance() != 0.0){
            System.out.println("Outstanding account fees found: "+ transactionCustomer.getAccountBalance());
            System.out.println("Adding fees to transaction.");
            newTransaction.addNewLineItem(new nonMediaItem("Account Fees", 0, transactionCustomer.getAccountBalance(), 0));
        }
        inTransactionOptions();
    }

    /**
     * Adds customer's account to their transaction.
     */


    /**
     * Adds balance to customer's account.
     */
    void addCustomerBalance() {
        // TODO - implement Transaction.addCustomerBalance
        throw new UnsupportedOperationException();
    }

    /**
     * Adds a new item to transaction.
     */
    void addNewLineItem() {
        // TODO - implement Transaction.addNewLineItem
        throw new UnsupportedOperationException();
    }

    /**
     * Removes an item from the transaction.
     */
    void removeLineItem() {
        // TODO - implement Transaction.removeLineItem
        throw new UnsupportedOperationException();
    }

    /**
     * Processes the payment by the customer.
     */
    void processPayment() {
        // TODO - implement Transaction.processPayment
        throw new UnsupportedOperationException();
    }
}
