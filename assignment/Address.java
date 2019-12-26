package assignment;

public class Address {
	private int houseNo;
	private String street;
	private String City;
	private String State;
	public Address(int houseNo, String street, String city, String state) {
		super();
		this.houseNo = houseNo;
		this.street = street;
		City = city;
		State = state;
	}
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", street=" + street + ", City=" + City + ", State=" + State + "]";
	}
	

}
