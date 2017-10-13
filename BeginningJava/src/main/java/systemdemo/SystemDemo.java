package systemdemo;

import java.util.Properties;

public class SystemDemo {
	public static void main(String[] args) {
		/*int arr1[] = new int[1050000];
		int arr2[] = new int[1050000];
		long startTime, endTime;
		startTime = System.currentTimeMillis();
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
		startTime = System.currentTimeMillis();
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
		System.gc();
		System.exit(0);
		*////Properties
		
		Properties p1=System.getProperties();
		p1.list(System.out);
		

	}

}
