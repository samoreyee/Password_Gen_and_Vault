package app;
import Model.User;
import Model.Credential;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
 
		Scanner user = new Scanner(System.in); 

		
		System.out.println("Input User Name: ");
		
		String userName = user.nextLine();
		
		System.out.println("Input Email: ");
		
		String userEmail = user.nextLine();
		
		System.out.println("Input Password: ");
		
		String password = user.nextLine();
		
		User newUser = new User(userName, userEmail, password);

		System.out.println("Profile Created!");
		
		System.out.println("********************  Welcome to LockedIn  ********************");
	
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
				
				System.out.println("New Credential User Name: ");
				String credentialUserName = user.nextLine();
				
				System.out.println("New Credential Email: ");
				String credentialEmail = user.nextLine();
				
				System.out.println("New Credential Password: "); 
				String credentialPassword= user.nextLine();
								
				Credential newCredential = new Credential(credentialName, credentialUserName, credentialEmail, credentialPassword);

				newUser.addCredential(newCredential); 
				
				System.out.println("Locked in");
 
				continue; 
				
				case "Library" : 
					
					newUser.displayCredentials();
					System.out.println("Which Credential would you like to select? ");
					String targetName = user.nextLine(); 
					
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
