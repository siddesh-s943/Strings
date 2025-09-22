package tap.bitbrains;
import java.util.Scanner;

public class SpecifiedCh {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String : ");
		String str = sc.nextLine();
		System.out.println("Enter Specified Char To Search: ");
		char ch = sc.next().charAt(1);
		boolean found = false;
		for (int i = 0; i < str.length(); i++) {
			if (ch == str.charAt(i)) {
				found = true;
				break;
			}
		}
		if (found) 
			System.out.println("Yes"); 
		else 
			System.out.println("No");		
	}
}