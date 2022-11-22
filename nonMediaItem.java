public class nonMediaItem extends Item {

	private String description;

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public nonMediaItem(String description, int UPC, double price, int inventoryCount) {
		this.description = description;
		this.UPC = UPC;
		this.price = price;
		this.inventoryCount = inventoryCount;
	}

	public String toString() {
		return description + "\t$" + price + "\t" + inventoryCount + "\t" + UPC;

	}

}