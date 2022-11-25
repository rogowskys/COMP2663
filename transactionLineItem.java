/**
 * Allows the item to be added to the transaction.
 */
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
     * Processes item through transaction.
     *
     * @param transactionLineItem item to be processed
     * @param quantity quantity of item
     */
    public transactionLineItem(Item transactionLineItem, int quantity) {
        this.transactionLineItem = transactionLineItem;
        this.quantity = quantity;
    }

}
