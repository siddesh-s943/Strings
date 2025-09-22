package tap.bitbrains;

public class SumOfDigInStr {
	public static void main(String[] args) {
		String str = "12365@asdfg4789";
		isSumofdif(str);
	}
	
	
	
	static void isSumofdif(String str) {
		int sum=0;
		for (int j = 0; j < str.length(); j++) {
			char ch = str.charAt(j);
			if(ch>='0'&&ch<='9')
				sum=sum+ch-'0';		
		}
		System.out.println(sum);
		
	}

}
