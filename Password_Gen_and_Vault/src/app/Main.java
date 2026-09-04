package app;
import Model.User;
import Model.Credential;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
 
		Scanner user = new Scanner(System.in); 
		
		User newUser = null;
		boolean running1 = true;
	while(running1) {
		System.out.println("Input User Name: ");
		
		String userName = user.nextLine();
		
		if (userName.isEmpty()) {
	        System.out.println("Username cannot be empty.");
	        
;
	    }
		
		System.out.println("Input Email: ");
		
		String userEmail = user.nextLine();
		
		if (userEmail.isEmpty()) {
	        System.out.println("Email cannot be empty.");
	  
	    }
		
		System.out.println("Input Password: ");
		
		String password = user.nextLine();
		
		if (password.isEmpty()) {
	        System.out.println("Username cannot be empty.");
	       
	    }
		
		newUser = new User(userName, userEmail, password);

		System.out.println("Profile Created!");
		
		System.out.println("********************  Welcome to LockedIn  ********************");
		
		running1 = false;

	}
	
	
		boolean running = true;
		
		while(running) {			
			System.out.println("Choose an option : Create Password or Create a new Credential or Library or Sign out");
			
			String option = user.nextLine(); 
			
			switch(option) {
			
				case "Password" : System.out.println("Password Gen App Opens");
				
				break;
				
				case "Credential" : 
				System.out.println("New Credential Name: ");
				String credentialName = user.nextLine();
				
				if (credentialName.isEmpty()) {
			        System.out.println("Name cannot be empty.");
			        continue;
			    }
				
				System.out.println("New Credential User Name: ");
				String credentialUserName = user.nextLine();
				
				if (credentialUserName.isEmpty()) {
			        System.out.println("Username cannot be empty.");
			        continue;
			    }
				
				System.out.println("New Credential Email: ");
				String credentialEmail = user.nextLine();
				
				if (credentialEmail.isEmpty()) {
			        System.out.println("Email cannot be empty.");
			        continue;
			    }
				
				System.out.println("New Credential Password: "); 
				String credentialPassword= user.nextLine();
				
				if (credentialPassword.isEmpty()) {
			        System.out.println("Username cannot be empty.");
			        continue;
			    }
								
				Credential newCredential = new Credential(credentialName, credentialUserName, credentialEmail, credentialPassword);

				newUser.addCredential(newCredential); 
				
				System.out.println("Locked in");
 
				continue; 
				
				case "Library" : 
					
					newUser.displayCredentials();
					System.out.println("Which Credential would you like to select? ");
					String targetName = user.nextLine(); 
					if (targetName.isEmpty()) {
				        System.out.println("cannot be empty.");
				        continue;
				    }
					
					newUser.selectCredentials(targetName);
					
				running = false;
				break; 
				
				case "Sign Out" : System.out.println("Signed Out.");		
				running = false;
				break; 
				
				default: System.out.println("Invalid");
				break;

			}
			
		}
		
		user.close(); 
	}

}
