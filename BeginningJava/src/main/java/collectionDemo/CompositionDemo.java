package collectionDemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompositionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String c1[] = { new String("Sang"), new String("Shin"), new String("Boston"), new String("Passion"),
				new String("Shin"), };

		String c2[] = { new String("Sang"), new String("Shin"), new String("Boston"), new String("Passion"),
				new String("Shin"), };

		List<String> l1 = Arrays.asList(c1);
		List<String> l2 = Arrays.asList(c2);

		boolean disjoint = Collections.disjoint(l1, l2);
		System.out.println("Disjoint: " + disjoint);
		System.out.println("Frequency of Sang: " + Collections.frequency(l1, "Sang"));
	}

}
