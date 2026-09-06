package app;
import Model.User;
import Model.Credential;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
 
		Scanner user = new Scanner(System.in); 
		
		User newUser = null;
		String userName;
		String userEmail;
		String password;
		
		System.out.println("********************  Welcome to LockedIn  ********************");

//users userName
		
	while(true) {
		System.out.print("Input User Name: ");
		userName = user.nextLine();
		if (userName.isEmpty()) {
	        System.out.print("Username cannot be empty.");
	    }
		else {
			break;
		}
		
	}

//users email
	
	while(true) {
		System.out.print("Input Email: ");
		 userEmail = user.nextLine();
		if (userEmail.isEmpty()) {
	        System.out.println("Email cannot be empty.");
	    }
		else {
			break;
		}
	}
	
//user password
	
	while(true) {
		System.out.print("Input Password: ");
		password = user.nextLine();
		if (password.isEmpty()) {
	        System.out.println("Password cannot be empty.");
	    }
		else {
			break;
		}
	}
//matching it to user class
	
		newUser = new User(userName, userEmail, password);
		System.out.println("");
		System.out.println("Profile Created!");
		
// main homepage where you select what you want to do 
		
		
	
		boolean running = true;
		
//main option 
		
		while(running) {			
			System.out.println(
			        "\nChoose an Option:" + "\n1) Create Password" + "\n2) Create a new Credential" +"\n3) Library" + "\n4) Sign out" );
			String option = user.nextLine(); 

// the choice loop begins
			
		switch(option) {

// I need to create a password gen class to connect here
	//case 1 
				case "1" : System.out.println("Password Gen App Opens");
				break;
	
// Creating a new Credential Menu
				
	//case 2 
				case "2" : 	
					
					String credentialName;
					String credentialUserName;
					String credentialEmail;
					String credentialPassword;
					
			while(true) {		
				System.out.print("New Credential Name: ");
				credentialName = user.nextLine();	
				if (credentialName.isEmpty()) {
			        System.out.println("Name cannot be empty.");
				}
			        else {
			        	break;
			        }
			    }
			
//Creating Credential User Name
			
			while(true) {	
				System.out.print("New Credential User Name: ");
				credentialUserName = user.nextLine();
				
				if (credentialUserName.isEmpty()) {
			        System.out.println("Username cannot be empty.");
			    }
				else {
					break;
				}
			}
			
//Creating Credential Email			
			
			while (true) { 
				System.out.print("New Credential Email: ");
				credentialEmail = user.nextLine();
				if (credentialEmail.isEmpty()) {
			        System.out.println("Email cannot be empty.");
			    }
				else {
					break;
				}
			}
				
//Creating Credential Password		
			
			while (true){
				System.out.print("New Credential Password: "); 
				credentialPassword= user.nextLine();
				if (credentialPassword.isEmpty()) {
			        System.out.println("Password cannot be empty.");
			    }
				else {
					break;
				}
			}

//logging the results in the array list in User class
											
				Credential newCredential = new Credential(credentialName, credentialUserName, credentialEmail, credentialPassword);
				newUser.addCredential(newCredential); 
				System.out.println("");
				System.out.println("********************  LockedIn  ********************");
				System.out.println("");

				break; 

// opening up the library of the credential you made
	//case 3
				case "3" : 
					System.out.println("");
					System.out.println("********************  Library  ********************");
					System.out.println("");


					newUser.displayCredentials();
				while(true) {
					System.out.println("");
					System.out.println("Which Credential would you like to select? ");
					
				try {
					int selection = Integer.parseInt(user.nextLine());

			        if (selection >= 1 && selection <= newUser.getCredentialCount()) {
			        	
			        	Credential selected = newUser.getCredential(selection - 1);
			        	
			        	System.out.println(selected.getCredentialName().toUpperCase());
			        	System.out.println("User Name = " +selected.getCredentialUserName());
			        	System.out.println("Email = " + selected.getCredentialEmail()); 
			        	System.out.println("Password = " + selected.getCredentialPassword()); 

			            break;
			        }
			        System.out.println("Invalid selection.");
				}
			        catch (NumberFormatException e) {
			            System.out.println("");

			            System.out.println("Error: That is not a number. Please enter digits only.");
			           
			        }
			        
				}

				break; 
				
//signing out of program 
	//case 4 
				case "4" : System.out.println("Signed Out.");		
				running = false;
				break; 
//invalid choice 
	//case 5 
				default: System.out.println("Invalid");
				break;

			}
			
		}
		
		user.close(); 
	}
}
