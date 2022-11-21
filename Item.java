public abstract class Item {

	int UPC;
	float price;
	int inventoryCount;


	public int getUPC() {
		return UPC;
	}

	public float getPrice() {
		return price;
	}

	public int getInventoryCount() {
		return inventoryCount;
	}

	public void setUPC(int UPC) {
		this.UPC = UPC;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void setInventoryCount(int inventoryCount) {
		this.inventoryCount = inventoryCount;
	}

}