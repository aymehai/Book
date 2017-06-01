
public class BookApp {
	public static void main(String[] args) {
		
		Book defaultBook = new Book();
		Book customBook = new Book("Harry Potter", "JK Rowling", "Advanced Book", 20.99);
	
		System.out.println("is the book \"" + customBook.getTitle()+ "\" in stock... \nlets check. My system says \"" + customBook.isInStock() + ".\" well there is your answer");
		System.out.println(" ");
		System.out.println("is the book \"" + defaultBook.getTitle()+ "\" in stock... \nlets check. My system says \"" + defaultBook.isInStock() + ".\" well there is your answer");
		
		System.out.println(" ");
		
		System.out.println(customBook.getDisplayText());
		
		System.out.println(" ");
		
		System.out.println(defaultBook.getDisplayText());
	}

}
