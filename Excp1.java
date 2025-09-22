package stringrcb;
import java.util.Scanner;
public class Excp1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Enter the User Name: ");
		String str = sc.next();
		
		if(str.length()<8)
			throw new NullPointerException("Minimumu length must be 8");
		if(!validUserPW(str))
			throw new ArithmeticException("It must have atleast one digit, Alpabetic & Special Character");
			System.out.println("User Name Is Valid...");
			System.out.print("Confirm Password: ");
            String str1 = sc.next();

            if (!str.equals(str1))
                throw new Exception("Passwords is not match");

            System.out.println("Password is correct");
        
	}catch (Exception e) {
        System.out.println(e.getMessage());
    } finally {
        System.out.println("Main Method End");
    }
}
	private static boolean validUserPW(String str) {
		boolean hasalpha = false, hassmall=false, hasdigit=false, hasspclchar=false;
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(Character.isLowerCase(ch[i]))
				hassmall = true;
			if(Character.isDigit(ch[i]))
				hasdigit = true;
			if(Character.isUpperCase(ch[i]))
				hassmall =  true;
			else
				hasspclchar = true;
		}
		return hasalpha && hassmall && hasdigit && hasspclchar ;
	}
}