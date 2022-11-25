/**
 * (Write a succinct description of this class here. You should avoid
 * wordiness and redundancy. )
 *
 * Bugs: (a list of bugs and other problems)
 * 
 * @author Kylie DeViller (162298d) <162298d@ACADIAU.CA>; and Sean Rogowsky (134715r) 134715r@ACADIAU.CA> 
 */

public class mediaItem extends Item {

	private String title;
	private String location;
	private String actors;
	private String director;
	private String producer;
	private int rentalLength;
	private mediaType typeOfMedia;

	public mediaItem() {
		// Null Constructor
	}

	/**
	 * Adds a new media item.
	 *
	 * @param UPC universal product code for this media item
	 * @param price price of this media item
	 * @param inventoryCount number of this media item in inventory
	 * @param title title of this media item
	 * @param location location of where this media item is
	 * @param actors actors in this media item
	 * @param director director of this media item
	 * @param producer producer of this media item
	 * @param rentalLength time period that this media item can be rented
	 * @param typeOfMedia media type of this item
	 */
	 public mediaItem(int UPC, double price, int inventoryCount, String title, String location, String actors,
			String director,
			String producer, int rentalLength, mediaType typeOfMedia) {
		super.UPC = UPC;
		super.price = price;
		super.inventoryCount = inventoryCount;
		this.title = title;
		this.location = location;
		this.actors = actors;
		this.director = director;
		this.producer = producer;
		this.rentalLength = rentalLength;
		this.typeOfMedia = typeOfMedia;
		super.description = title;

	}

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

	@Override
	public String toString() {
		return title + "\t\t\t" + UPC + "\t$" + price + "\t" + typeOfMedia;
	}

}