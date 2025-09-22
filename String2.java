package tap.bitbrains;

public class String2 {
	public static void main(String[] args) {
		ratioOfCapsAndSml("HelloAloo");
	}
	static void ratioOfCapsAndSml(String str) {
		int count = 0, scount = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z')
				count++;
			else if (ch >= 'a' && ch <= 'z')
				scount++;
		}
		
		System.out.println(count+":"+scount);
	}
}
