package knijarnica;

public class ComicBook extends Book {

	private String characterName;

	public ComicBook()
	{
		
	}
	public ComicBook(String title, Author author, BookType bookType, int available, double price) {
		super(title, author, bookType, available, price);
	}

	public double getPrice()
	{
		double newPrice = this.getPrice() - this.getPrice()*0.6;
		this.setPrice(newPrice);
		//prints the new Price in the console
		System.out.println(newPrice);
		//returns the new price
		return newPrice;
	}
	
	public String getCharacterName() {
		return characterName;
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}
}
