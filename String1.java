package tap.bitbrains;
import java.util.Scanner;
public class String1 {
	public static void main(String1[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your String : ");
		String str = sc.nextLine();
		int alpa = 0, dig = 0, spc = 0;
		
		for (int i = 0; i < args.length; i++)
		{
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z'|| ch>='a'&&ch<='z')
				alpa++;
			else if (ch >= '0' && ch <= '9')
				dig++;
			else
				spc++;
		}
		System.out.println(alpa);
		System.out.println(dig);
		System.out.println(spc);
	}
}