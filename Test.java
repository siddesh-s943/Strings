package collections;
import java.util.*;
public class Test { 
	public static void main(String[] args) {
		TreeMap m = new TreeMap<>();
		m.put(10, "Sid, 21, 101, bngl");
		m.put(11, "Darshi, 22, 102, Dvg");
		m.put(12, "Vigni, 23, 103, cta");
		m.put(13, "Maddu, 24, 104, Mngl");
		
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.entrySet());

		Set<Integer> k = m.keySet();
		Iterator itr = k.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		Collection v = m.values();
		Iterator itr1 = v.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}
}

