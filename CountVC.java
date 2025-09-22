package tap.bitbrains;
public class CountVC {
	public static void main(String[] args) {
		String str = "Siddharth@123";
		int uc = 0, lc = 0, dc = 0, sp = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z')
				uc++;
			else if (ch >= 'a' && ch <= 'z')
				lc++;
			else if (ch >= '0' && ch <= '9')
				dc++;
			else
				sp++;
		}
		System.out.println("Capital letters " + uc);
		System.out.println("Small letters " + lc);
		System.out.println("Digits " + dc);
		System.out.println("Specaial Char " + sp);
	}
}