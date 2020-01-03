package jdbc;

public class Roles {
	
	private int role_no;
	private String name;
	private String privilages;
	
	
	public Roles(int role_no, String name, String privilages) {
		super();
		this.role_no = role_no;
		this.name = name;
		this.privilages = privilages;
	}
	public int getRole_no() {
		return role_no;
	}
	public void setRole_no(int role_no) {
		this.role_no = role_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrivilages() {
		return privilages;
	}
	public void setPrivilages(String privilages) {
		this.privilages = privilages;
	}
	@Override
	public String toString() {
		return "Roles [role_no=" + role_no + ", name=" + name + ", privilages=" + privilages + "]";
	}


}
