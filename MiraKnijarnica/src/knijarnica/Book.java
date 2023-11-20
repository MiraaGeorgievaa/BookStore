package knijarnica;

public class Book {
	private String title;
	private Author author;
	private BookType bookType;
	private int available;
	private double price;
	
	public Book()
	{
		
	}
	public Book(String title, Author author, BookType bookType, int available, double price)
	{
		this.setTitle(title);
		this.setAuthor(author);
		this.setBookType(bookType);
		this.setAvailable(available);
		this.setPrice(price);
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public BookType getBookType() {
		return bookType;
	}
	public void setBookType(BookType bookType) {
		this.bookType = bookType;
	}
	public int getAvailable() {
		return available;
	}
	public void setAvailable(int available) {
		this.available = available;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
