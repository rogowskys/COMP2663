public abstract class Item {

	int UPC;
	double price;
	int inventoryCount;

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

}