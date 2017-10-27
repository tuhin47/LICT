package collectionDemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortDemo {

	public static void main(String[] args) {
		// Set up test data
		String n[] = { new String("John"), new String("Karl"), new String("Groucho"), new String("Oscar") };
		// Create a List from an array
		List l = Arrays.asList(n);
		// Perform the sorting operation
		Collections.sort(l);
		System.out.println(l);
		Collections.reverse(l);
		System.out.println(l);

	}
}
