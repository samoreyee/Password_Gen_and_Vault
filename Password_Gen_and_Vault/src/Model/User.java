package Model;
import java.util.ArrayList;
public class User {
		
		private String userName; 
		private String email; 
		private String password; 
		
		public User (String userName, String email, String password) {
		
			this.userName = userName; 
			this.email = email; 
			this.password = password; 
			
		}
		
		public String getUserName() { 
			return userName;
		}
		
		public void setUserName(String userName) {
			this.userName = userName; 
		}
		
		public String getEmail() { 
			return email; 
		}
		
		public void setEmail(String email) {
			this.email = email; 
		}
		
		public String getPassword() { 
			return password; 
		}
		
		public void setPassword(String password) { 
			this.password = password; 
		}
		
		private ArrayList<Credential> credentials = new ArrayList<Credential>(); 
		
		public void addCredential(Credential credential) {
			
			this.credentials.add(credential);
			
		}
		
		public void displayCredentials() { 
			for(int i= 0; i < credentials.size() ; i++) {
				System.out.println((1 + i + ")")+ (" ") + credentials.get(i).getCredentialName());}
				
				
		}
			
		
		public void selectCredentials(String targetName) { 
			for (int i= 0; i < credentials.size() ; i++) {
				if (credentials.get(i).getCredentialName().equals(targetName)) {
				System.out.println("");
		           System.out.println("Credential Found!");
					return ; 
		        }
				
			}
	           System.out.println("No Credential Found!");

		}
		
		
		


}
