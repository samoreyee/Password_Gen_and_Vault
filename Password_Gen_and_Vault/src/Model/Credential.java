package Model;

public class Credential {
	
	private String credentialName; 
	private String credentialUserName;
	private String credentialEmail; 
	private String credentialPassword; 
	
	public Credential(String credentialName, String credentialUserName, String credentialEmail, String credentialPassword) {
		this.credentialName= credentialName;
		this.credentialUserName = credentialUserName;
		this.credentialEmail = credentialEmail; 
		this.credentialPassword = credentialPassword; 
	
	}
	
	
//GET AND SET SECTION
	
	
	public String getCredentialName() {
		return credentialName; 
	}
	
	public void setCredentialName(String credentialName) { 
		this.credentialName = credentialName; 	
	}
	
	public String getCredentialUserName() { 
		return credentialUserName; 
	}
	
	public void setCredentialUserName(String credentialUserName) { 
		this.credentialUserName = credentialUserName; 
	}
	
	public String getCredentialEmail() {
		return credentialEmail; 
	}

	public void setCredentialEmail(String credentialEmail) {
		this.credentialEmail = credentialEmail; 
	}
	
	public String getCredentialPassword() { 
		return credentialPassword;
	}
	
	public void setCredentialPassword(String credentialPassword) {
		this.credentialPassword=credentialPassword; 
	}
}
