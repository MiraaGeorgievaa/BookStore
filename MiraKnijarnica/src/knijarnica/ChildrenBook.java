package knijarnica;

public class ChildrenBook extends Book{
	
	private int age;
	
	public ChildrenBook()
	{
		
	}
	public ChildrenBook(String title, Author author, BookType bookType, int available, double price) {
		super(title, author, bookType, available, price);
	}
	public double getPrice()
	{
		double newPrice = this.getPrice() - this.getPrice()*0.7;
		this.setPrice(newPrice);
		//prints the new Price in the console
		System.out.println(newPrice);
		//returns the new price
		return newPrice;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
