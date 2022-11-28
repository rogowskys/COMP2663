/**
 * Non-media item class creates non-media type items.
 *
 * Bugs: None that we are aware of.
 * 
 * @author Kylie DeViller (162298d) <162298d@ACADIAU.CA>; and Sean Rogowsky (134715r) 134715r@ACADIAU.CA> 
 */
package posPackage;


public class nonMediaItem extends Item {

	private String description;

	/**
	 * Creates a new non-media item.
	 *
	 * @param description description of this non-media item
	 * @param UPC universal product code of this non-media item
	 * @param price price of this non-media item
	 * @param inventoryCount number of this non-media item in inventory
	 */
	public nonMediaItem(String description, int UPC, double price, int inventoryCount) {
		this.description = description;
		this.UPC = UPC;
		this.price = price;
		this.inventoryCount = inventoryCount;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String toString() {
		return description + "\t$" + price + "\t" + inventoryCount + "\t" + UPC;

	}

}