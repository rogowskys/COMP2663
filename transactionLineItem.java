/**
 * (Write a succinct description of this class here. You should avoid
 * wordiness and redundancy. )
 *
 * Bugs: (a list of bugs and other problems)
 * 
 * @author Kylie DeViller (162298d) <162298d@ACADIAU.CA>; and Sean Rogowsky (134715r) 134715r@ACADIAU.CA> 
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
