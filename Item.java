/**
 * Creates an item.
 */
public class Item {

	private int UPC;
	private double price;
	private int inventoryCount;
	private String description;

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

	public void setInventoryCount(int inventoryCount) {
		this.inventoryCount = inventoryCount;
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