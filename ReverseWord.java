package tap.bitbrains;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter Your String: ");
    	String input = sc.next();
//      String input = "Rama And Laxmana";
        System.out.println(reverseWord(input));
    }
    static String reverseWord(String st) {
        char[] ch = st.toCharArray();
        int count = 0;

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ' ') { 
                Swap.swap(ch, i - count, i - 1);
                count = -1;
            }
            if (i == ch.length - 1) {
                Swap.swap(ch, i - count, i);
            }
            count++;
        }
        return new String(ch); 
    }
}