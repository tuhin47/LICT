package timedemo;

import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		Date d1=new Date();
		for(int i=0;i<10000000;i++){
			int j=i;
		}
		Date d2= new Date();
		long elapsed_time=d2.getTime()-d1.getTime();
		System.out.println("that took:"+elapsed_time+" ms");
				
		
	}

}
