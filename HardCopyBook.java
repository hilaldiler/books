package tr.org.kamp.linux.Books;

public class HardCopyBook extends Book{

	protected double weight;
	protected double shoppingCost;
	

	
	public HardCopyBook(String name, String author, int price, int bookId, int applyDiscount, double weight,
			double shoppingCost, int shippingCost, int getTotalCost) {
		super(name, author, price, bookId, applyDiscount);
		this.weight = weight;
		this.shoppingCost = shoppingCost;
	}
	
public int getTotalCost() {
	
}
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getShoppingCost() {
		return ShippingCost;
	}
	public void setShoppingCost(int shoppingCost) {
		ShippingCost = shoppingCost;
	}
	public int getGetTotalCost() {
		return getTotalCost;
	}
	public void setGetTotalCost(int getTotalCost) {
		this.getTotalCost = getTotalCost;
	}
	
}
