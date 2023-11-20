package knijarnica;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Vuvedete broi knigi: ");
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt(); 
		
		BookStore bookStore = new BookStore();
		
		for(int i = 1; i <= count; i++)
		{
			scanner = new Scanner(System.in);
			Book newBook = new Book();
			System.out.println("Vuvedete zaglavie za kniga nomer " + i);
			String title = scanner.nextLine();
			scanner = new Scanner(System.in);
			System.out.println("Vuvedete avtor na kniga nomer " + i);
			Author newAuthor = new Author();
			newAuthor.setName(scanner.nextLine());
			System.out.println("Vuvedete vida na kniga nomer: " + i);
			switch(scanner.nextLine())
			{
			case "Comic Book":
				newBook = new ComicBook();
				
			case "Children Book":
				newBook = new ChildrenBook();
			default:
				newBook = new Book();
			}
			
			System.out.println("Vuvedete broq nalichnost na kniga nomer: " + i);
			int available = scanner.nextInt();
			System.out.println("Vuvedete cenata na kniga nomer: " + i);
			double price = scanner.nextDouble();
			
			newBook.setTitle(title);
			newBook.setAuthor(newAuthor);
			newBook.setAvailable(available);
			newBook.setPrice(price);
			
			bookStore.addBook(newBook);
			
		}
		
		
		
		//Selling books
		
		for(int i = 0; i < bookStore.getBooks().size(); i++)
		{
			System.out.println(bookStore.sellBook(bookStore.getBooks().get(i)));
		}
	}

}
