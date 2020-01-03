package jdbc;


public class Users {
	private int id;
	private String name;
	private String username;
	private String password;
	private String email;
	private int roll_id;
	private Roles role; 
	private String number;
	
	public Users(int id, String name, String username, String password, String email, int roll_id, Roles role,
			String number) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.email = email;
		this.roll_id = roll_id;
		this.role = role;
		this.number = number;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Roles getRole() {
		return role;
	}
	public void setRole(Roles role) {
		this.role = role;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	
	
	public int getRoll_id() {
		return roll_id;
	}

	public void setRoll_id(int roll_id) {
		this.roll_id = roll_id;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", username=" + username + ", password= "+retStar(password) + ", email="
				+ email + ", role=" + role.getName() + ", number=" + number + "]";
	}
	
	public String retStar(String pass)
	{	
		String s="*";
		int len =pass.length();
		for(int i=1;i<len;++i)
		{
			s=s+"*";
		}
		return s;
	}
	
	
	

	
}
