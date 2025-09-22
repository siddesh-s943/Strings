package tap.bitbrains;

public class Swap {
	public static void main(String[] args) {
		
	}
	static void swap(char[] ch,int i,int j){
        while(i<j){
            char t=ch[i];
            ch[i]=ch[j];
            ch[j]=t;
            i++;
            j--;
        }
    }
}
