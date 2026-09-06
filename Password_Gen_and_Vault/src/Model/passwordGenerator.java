package Model;
import java.security.SecureRandom;
public class passwordGenerator {
	
	private static final String CHAR_POOL = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm!@#$%^&*()";
	private static final int DEFAULT_LENGTH = 20; 
	
	
	public static String generatePassword(int length) { 
		if (length <2) 
		{
			length = DEFAULT_LENGTH; 
		}
		
		SecureRandom random = new SecureRandom(); 
		StringBuilder password = new StringBuilder();
		
		for (int i = 0; i < length; i++) {
			int index = random.nextInt(CHAR_POOL.length());
			password.append(CHAR_POOL.charAt(index)) ;
			
		}	
		return password.toString();		
	}
	
}
 