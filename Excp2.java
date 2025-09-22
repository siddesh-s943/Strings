package stringrcb;
import java.util.Scanner;
public class Excp2 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the main method");
	        try {
	            System.out.print("Enter Password: ");
	            String password = sc.nextLine();
	            validatePassword(password);
	            System.out.print("Confirm Password: ");
	            String confirm = sc.nextLine();
	            
	            if (!password.equals(confirm)) {
	                throw new Exception("Passwords is not match");
	            }
	            System.out.println("Password is correct");
	        } 
	        catch (Exception e) {
	            System.out.println(e.getMessage());
	        } 
	        finally {
	            System.out.println("Main method end");
	        }
	    }

	    private static String validatePassword(String password) throws Exception {
	        if (password.length() < 8) {
	            throw new Exception("Password must be at least 8 characters long.");
	        }
	        if (!password.matches(".*[A-Z].*")) {
	            throw new Exception("Password must contain at least one uppercase letter.");
	        }
	        if (!password.matches(".*[a-z].*")) {
	            throw new Exception("Password must contain at least one lowercase letter.");
	        }
	        if (!password.matches(".*\\d.*")) {
	            throw new Exception("Password must contain at least one digit.");
	        }
	        if (!password.matches(".*[@#$%^&+=!].*")) {
	            throw new Exception("Password must contain at least one special character.");
	        }
	        return password;
	    }
}