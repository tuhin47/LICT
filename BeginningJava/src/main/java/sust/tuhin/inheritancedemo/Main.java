package sust.tuhin.inheritancedemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Movie movie = new Movie();
		
		movie.setCondition("Released");
		movie.setPrice(400);
		
		System.out.println("Condition: "+movie.getCondition());
		System.out.println("Price "+ movie.getPrice());
		System.out.println("Title: "+movie.getTitle());
		System.out.println("Length: "+movie.getLength());
		
		

	}

}
