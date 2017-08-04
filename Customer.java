package tr.org.kamp.linux.Books;

public class Customer { //müsteri
	
	protected String userName;
	ArrayList<Purchase> [] purchaseHistory;
	protected int purchaseCount;

	
	
	public void placePurchase(Purchase purchase) {
		purchaseHistory.add(purchase);
	}
	public Customer(String userName, Purchase[] purchaseHistory, Purchase purchaseCount, Purchase placePurchase) {
		super();
		this.userName = userName;
		this.purchaseHistory = purchaseHistory;
		this.purchaseCount = purchaseCount;
		this.placePurchase = placePurchase;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Purchase[] getPurchaseHistory() {
		return purchaseHistory;
	}

	public void setPurchaseHistory(Purchase  [] purchaseHistory) {
		this.purchaseHistory = purchaseHistory;
	}

	public Purchase getPurchaseCount() {
		return purchaseCount;
	}

	public void setPurchaseCount(Purchase purchaseCount) {
		this.purchaseCount = purchaseCount;
	}

	public Purchase getPlacePurchase() {
		return placePurchase;
	}

	public void setPlacePurchase(Purchase placePurchase) {
		this.placePurchase = placePurchase;
	}
	
	

}
