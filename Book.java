package tr.org.kamp.linux.Books;

public class Book {
	protected String name;
	protected String author;
	protected int price;
	protected int bookId;
	protected int Discount=0; //indirim uygulaması
	
	
	public Book(String name, String author, int price, int bookId, int applyDiscount) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
		this.bookId = bookId;
	}
	
	public double applyDiscount(double discount,double price) {
		if(discount>0) {
			price=price-(price*discount/100);
			return price;
			
		}else {
			return price;
		}
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getBookId() {
		return bookId;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public int getApplyDiscount() {
		return applyDiscount;
	}


	public void setApplyDiscount(int applyDiscount) {
		this.applyDiscount = applyDiscount;
	}



	
	
	
	

}
