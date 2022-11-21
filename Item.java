public abstract class Item {

	int UPC;
	float price;
	int inventoryCount;
	int itemID;

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public int getUPC() {
		return UPC;
	}

	public float getPrice() {
		return price;
	}

	public int getInventoryCount() {
		return inventoryCount;
	}

	public void setUPC(int uPC) {
		UPC = uPC;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void setInventoryCount(int inventoryCount) {
		this.inventoryCount = inventoryCount;
	}

}