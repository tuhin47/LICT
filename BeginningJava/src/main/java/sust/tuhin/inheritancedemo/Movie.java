package sust.tuhin.inheritancedemo;

public class Movie extends InventoryItem{
	private String title;
	private int length;
	public Movie() {}
	public Movie(String title,float price,String condition) {
		super(price,condition);
		this.title=title;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	

}
