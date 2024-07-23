package constructor;

public class book {
	 private String title;
	    private String author;
	    private int yearPublished;

	    public book(  String title, String author, int yearPublished) 
	    {
	    	this.title=title;
	    	this.author=author;
	    	this.yearPublished=yearPublished;
	    } 
	    
	    public void displayInfo() {
	        System.out.println("Title: " + title);
	        System.out.println("Author: " + author);
	        System.out.println("Year Published: " + yearPublished);
	    }
	    public static void main(String[] args) {
	        // Creating a new Book object using the constructor
	        book book1 = new book("1984", "suchit", 1949);

	        // Displaying information about the book
	        System.out.println("Book Information:");
	        book1.displayInfo();
	    }

	   
}
