	package Model;

public class User {
		
		private int ID; 
		private String UserName; 
		private String Email; 
		private String Password; 

		public User (int ID, String UserName, String Email, String Password) {
			this.ID = ID; 
			this.UserName = UserName; 
			this.Email = Email; 
			this.Password = Password; 
			
		}
		
		public int getID() { 
			return ID; 
		}
		
		public String getUserName() { 
			return UserName;
		}
		
		public void setUserName(String UserName) {
			this.UserName = UserName; 
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
			this.Password = Password; 
		}
		
}

