package collections;
public class Demo {
public static void main(String[] args) {
	StringBuffer sb = new StringBuffer();
	System.out.println(sb.length());
	
	System.out.println(sb.capacity());
	System.out.println(sb.length());
	
	sb.append("Sachin");
	System.out.println(sb.length());
	
	System.out.println(sb.capacity());
	sb.append("is");
	
	System.out.println(sb.length());
	System.out.println(sb.capacity());
	
	}
}
