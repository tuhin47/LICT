package collectionDemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchDemon {

	public static void main(String[] args) {
		// Set up testing data
		String name[] = { new String("Sang"), new String("Shin"), new String("Boston"), new String("Passion"),
				new String("Shin"), };
		List<String> l = Arrays.asList(name);
		int position = Collections.binarySearch(l, "Boston");
		System.out.println("Position of the searched item = " + position);

	}

}
