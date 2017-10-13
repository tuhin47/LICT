package collectionsList;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
public static void main(String[] args) {
	List list = new ArrayList();
	list.add("one");
	list.add("two");
	list.add(new Integer(12));
	System.out.println(list);
}
		
}
