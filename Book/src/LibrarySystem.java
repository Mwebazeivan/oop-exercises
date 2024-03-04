import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

class Patron {
    private String name;
    private static final int MAX_BORROWED_BOOKS = 3;

    public Patron(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getMaxBorrowedBooks() {
        return MAX_BORROWED_BOOKS;
    }
}

class LibraryTransaction {
    private Book book;
    private Patron patron;

    public LibraryTransaction(Book book, Patron patron) {
        this.book = book;
        this.patron = patron;
    }

    public void displayTransactionDetails() {
        System.out.println("Transaction Details:");
        System.out.println("Book Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Patron Name: " + patron.getName());
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

       
        Patron patron1 = new Patron("John Doe");
        Patron patron2 = new Patron("Jane Smith");

     
        LibraryTransaction transaction1 = new LibraryTransaction(book1, patron1);
        LibraryTransaction transaction2 = new LibraryTransaction(book2, patron2);

    
        transaction1.displayTransactionDetails();
        System.out.println(); 
        transaction2.displayTransactionDetails();
    }
}
