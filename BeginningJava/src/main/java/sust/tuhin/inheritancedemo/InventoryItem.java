package sust.tuhin.inheritancedemo;

public class InventoryItem {
	private float price;
	private String condition;
	public InventoryItem() {}
	public InventoryItem(float price, String condition) {
		this.price = price;
		this.condition = condition;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public final float area(float side) {
		
		return side* 0.0f;
	}

}
