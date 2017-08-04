package tr.org.kamp.linux.Books;

import java.util.List;

public class ShoppingCard {

	List <Book> contents;
	String numOfEntriesInTheCard;
	
	
	public void addBook(Book book) {
		contents.add(book);
	}
	
}
