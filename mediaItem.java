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

	public mediaItem(String title, int itemID) {
		this.title = title;
		this.itemID = itemID;
	}

}