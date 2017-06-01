import java.util.Random;

public class Book {

	private String title = "Green Eggs & Ham";
	private String author = "Dr.seuss";
	private String description = "Childrens Book";
	private double price = 15.99;
	private boolean isInStock = false;

	public Book() {
		Random random = new Random();
		int trueInStock = random.nextInt(2);
		if (trueInStock == 1) {
			isInStock = true;
		}
	}

	public Book(String userTitle, String userAuthor, String userDescription, double userPrice) {
		Random random = new Random();
		int trueInStock = random.nextInt(2);
		if (trueInStock == 1) {
			isInStock = true;
		}
		this.title = userTitle;
		this.author = userAuthor;
		this.description = userDescription;
		this.price = userPrice;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isInStock() {
		return isInStock;
	}

	public void setInStock(boolean isInStock) {
		this.isInStock = isInStock;
	}

	public String getDisplayText() {
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Description: " + description);
		return " ";
	}

	public String purchaseBook(int numberOfBooks) {
		String returnStatement;
		if (isInStock == true) {
			double priceOfBooks = numberOfBooks * price;
			priceOfBooks = Math.round(priceOfBooks*100.0)/100.0;
			returnStatement = "The total price is $" + priceOfBooks;
		} else {
			returnStatement = "sorry I can't do that for you the item is out of stock :(";
		}
		return returnStatement;

	}

}
