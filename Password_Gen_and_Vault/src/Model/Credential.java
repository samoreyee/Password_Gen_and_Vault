package Model;

public class Credential {
	
	private String Name; 
	private String UserName;
	private String Email; 
	private String Password; 
	
	public Credential(String Name, String UserName, String Email, String Password) {
		this.Name= Name;
		this.UserName = UserName;
		this.Email = Email; 
		this.Password = Password; 
	
	}
	
	public String getName() {
		return Name; 
	}
	
	public void setName(String Name) { 
		this.Name = Name; 	
	}
	
	public String getUserName() { 
		return UserName; 
	}
	
	public void setUserName(String Username) { 
		this.UserName = Username; 
	}
	
	public String getEmail() {
		return Email; 
	}

	public void setEmail(String Email) {
		this.Email = Email; 
	}
	
	public String getPassword() { 
		return Password;
	}
	
	public void setPassword(String Password) {
		this.Password=Password; 
	}
}
