package tap.bitbrains;

import java.util.Scanner;

public class SpecialChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "@Siddu_8147";
//		prasentInSpc(str);
		 
        System.out.print("Enter Specified Char To Search : ");
        char ch = sc.next().charAt(0);
		specifiedChar(str);
	}
	
	static void prasentInSpc(String str) {
		int spc=0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(! (ch>='A'&&ch<='Z'||ch>='a'&&ch<='z'||ch>='0'&&ch<='9'))
				spc++;
		}
		System.out.println(spc);
	}
	
	static boolean specifiedChar(String str) {
	return str.indexOf(str)!=-1;	
	}

}
