public class mediaItem extends Item {

	private String title;
	private String location;
	private String actors;
	private String director;
	private String producer;
	private int rentalLength;
	private mediaType typeOfMedia;

	public mediaType getTypeOfMedia() {
		return typeOfMedia;
	}

	public void setTypeOfMedia(mediaType typeOfMedia) {
		this.typeOfMedia = typeOfMedia;
	}

	public int getRentalLength() {
		return rentalLength;
	}

	public void setRentalLength(int rentalLength) {
		this.rentalLength = rentalLength;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getActors() {
		return this.actors;
	}

	public void setActors(String actors) {
		this.actors = actors;
	}

	public String getDirector() {
		return this.director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getProducer() {
		return this.producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public mediaItem() {
		// Null Constructor
	}

	/**
	 * @param UPC
	 * @param price
	 * @param inventoryCount
	 * @param title
	 * @param location
	 * @param actors
	 * @param director
	 * @param producer
	 * @param rentalLength
	 * @param typeOfMedia
	 */
	public mediaItem(int UPC, double price, int inventoryCount, String title, String location, String actors,
			String director,
			String producer, int rentalLength, mediaType typeOfMedia) {
		this.UPC = UPC;
		this.price = price;
		this.inventoryCount = inventoryCount;
		this.title = title;
		this.location = location;
		this.actors = actors;
		this.director = director;
		this.producer = producer;
		this.rentalLength = rentalLength;
		this.typeOfMedia = typeOfMedia;

	}

	public String toString() {

		return title + "\t\t\t" + UPC + "\t$" + price + "\t" + typeOfMedia;

	}

}