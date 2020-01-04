package Assesment;

public class Publisher {
	
	private int publisher_id;
	private String name;
	private String location;
	public Publisher(int publisher_id, String name, String location) {
		super();
		this.publisher_id = publisher_id;
		this.name = name;
		this.location = location;
	}
	public int getPublisher_id() {
		return publisher_id;
	}
	public void setPublisher_id(int publisher_id) {
		this.publisher_id = publisher_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "publisher [publisher_id=" + publisher_id + ", name=" + name + ", location=" + location + "]";
	}
	
	

}
