package collectionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList u2 = new ArrayList();
		u2.add("Beautiful Day");
		u2.add("Stuck In A Moment You Can't Get Out Of");
		u2.add("Elevation");
		u2.add("Walk On");
		u2.add("Kite");
		u2.add("In A Little While");
		u2.add("Wild Honey");
		u2.add("Peace On Earth");
		u2.add("When I Look At The World");
		u2.add("New York");
		u2.add("Grace");
		Comparator comp = null;
		Collections.sort(u2, comp);
		System.out.println(u2);
	}

}
