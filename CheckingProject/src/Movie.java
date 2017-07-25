
public class Movie {

	public static float price = 3.50f;
	private String rating;
	private static int numOfObject = 0;

	public Movie() {
		numOfObject++;
	}

	public static void setPrice(float newPrice) {
		price = newPrice;

	}

	public String getRating() {
		return rating;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Movie();
		new Movie();
		new Movie();
		System.out.println(Movie.numOfObject);

	}

}
