/**
 * Transaction line item class adds an item to the transaction in progress.
 *
 * Bugs: None that we are aware of.
 * 
 * @author Kylie DeViller (162298d) <162298d@ACADIAU.CA>; and Sean Rogowsky (134715r) 134715r@ACADIAU.CA> 
 */
package posPackage;

public class transactionLineItem {

    protected Item transactionLineItem;
    private int quantity;

    public Item getTransactionLineItem() {
        return transactionLineItem;
    }

    public void setTransactionLineItem(Item transactionLineItem) {
        this.transactionLineItem = transactionLineItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Processes item to be added to the current transaction.
     *
     * @param transactionLineItem item to be added to transaction
     * @param quantity quantity of item
     */
    public transactionLineItem(Item transactionLineItem, int quantity) {
        this.transactionLineItem = transactionLineItem;
        this.quantity = quantity;
    }

}
