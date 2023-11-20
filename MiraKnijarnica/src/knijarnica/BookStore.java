package knijarnica;

import java.util.ArrayList;
import java.util.List;

public class BookStore {
	private List<Book> books = new ArrayList<>();
	
	
	public List<Book> getBooks() {
		return books;
	}

	public void addBook(Book book)
	{
		this.books.add(book);
	}
	
	public String sellBook(Book book)
	{
		if(book == null)
		{
			return "Invalid Book";
		}

		if(book.getAvailable() > 0)
		{
			this.books.remove(book);
			return "Sold book: "+ book.getTitle() + " by: " + book.getAuthor().getName() + " at price: " + book.getPrice();
		}
		else 
		{
			if(book.getTitle() != null)
				return "The book " + book.getTitle() + "is not availavle in the library";
			else
				return "This book is not availavle in the library";
		}
		
	}
}
