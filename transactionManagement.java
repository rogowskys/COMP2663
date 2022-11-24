import java.util.Scanner;
import java.util.ArrayList;

public class transactionManagement {

    transaction newTransaction;

    public void transactionManagementMenu(ArrayList<transaction> transactionRegister) {
        Scanner scan = new Scanner(System.in);
        String menuOption = "";
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

    void inTransactionOptions(){

    }

    void createNewTransaction(){
        newTransaction = new transaction();


    }

    /**
     * Adds customer's account to their transaction.
     */
    void addCutomerAccount() {
        // TODO - implement Transaction.addCutomerAccount
        throw new UnsupportedOperationException();
    }

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
     * Updates the current subtotal after each item is added.
     */
    void updateSubtotal() {
        // TODO - implement Transaction.updateSubtotal
        throw new UnsupportedOperationException();
    }

    /**
     * Calculates the tax for the whole transaction.
     */
    void addTaxes() {
        // TODO - implement Transaction.addTaxes
        throw new UnsupportedOperationException();
    }

    /**
     * Adds the subtotal and taxes together to calculate the total
     * amount due by the customer.
     */
    void updateTotal() {
        // TODO - implement Transaction.updateTotal
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
