package demoset;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
	public static void main(String[] args) {
		Set ts=new LinkedHashSet();
		ts.add(1);
		ts.add(2);
		ts.add(3);
		ts.add(2);
		System.out.println("Members :"+ts);
	}
}
