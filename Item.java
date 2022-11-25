/**
 * Item class creates a base description for items.
 *
 * Bugs: None that we are aware of.
 * 
 * @author Kylie DeViller (162298d) <162298d@ACADIAU.CA>; and Sean Rogowsky (134715r) 134715r@ACADIAU.CA> 
 */

public class Item {

	protected int UPC;
	protected double price;
	protected int inventoryCount;
	protected String description;

	/**
	 * Creates and stores data for each item.
	 *
	 * @param description description of this item
	 * @param UPC universal product code for this item
	 * @param price price of this item
	 * @param inventoryCount number of this item currently in inventory
	 */
	public Item(String description, int UPC, double price, int inventoryCount) {
		this.UPC = UPC;
		this.price = price;
		this.inventoryCount = inventoryCount;
		this.description = description;
	}

	public Item() {
	};

	public int getUPC() {
		return UPC;
	}

	public double getPrice() {
		return price;
	}

	public int getInventoryCount() {
		return inventoryCount;
	}

	public void setUPC(int UPC) {
		this.UPC = UPC;
	}

	public void setInventoryCount(int countAdjustment) {
		inventoryCount += countAdjustment;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String toString() {
		return description + "\t$" + price + "\t" + inventoryCount + "\t" + UPC;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}