public class mediaItem {

	private int itemID;
	private string title;
	private string location;
	private string actors;
	private string director;
	private string producer;
	private Object rentalLength;
	private int attribute;

	public int getItemID() {
		return this.itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public string getTitle() {
		return this.title;
	}

	public void setTitle(string title) {
		this.title = title;
	}

	public string getLocation() {
		return this.location;
	}

	public void setLocation(string location) {
		this.location = location;
	}

	public string getActors() {
		return this.actors;
	}

	public void setActors(string actors) {
		this.actors = actors;
	}

	public string getDirector() {
		return this.director;
	}

	public void setDirector(string director) {
		this.director = director;
	}

	public string getProducer() {
		return this.producer;
	}

	public void setProducer(string producer) {
		this.producer = producer;
	}

	public int getAttribute() {
		return this.attribute;
	}

	public void setAttribute(int attribute) {
		this.attribute = attribute;
	}

}