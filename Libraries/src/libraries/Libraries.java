package Libraries;

import java.util.ArrayList;
import java.util.Date;

class Author {
    private String name;

    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Book {
    private String title;
    private Author author;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }
}

class Patron {
    private String name;

    public Patron(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class LibraryTransaction {
    private static final int MAX_BOOKS_PER_PATRON = 3;
    private static final double LATE_FEE = 0.50;
    private Book book;
    private Patron patron;
    private Date dueDate;
    private boolean returned;
    private boolean late;

    public LibraryTransaction(Book book, Patron patron, Date dueDate) {
        this.book = book;
        this.patron = patron;
        this.dueDate = dueDate;
        this.returned = false;
        this.late = false;
    }

    public Book getBook() {
        return book;
    }

    public Patron getPatron() {
        return patron;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public boolean isReturned() {
        return returned;
    }

    public boolean isLate() {
        return late;
    }

    public void setReturned(boolean returned) {
        this.returned = returned;
    }

    public void setLate(boolean late) {
        this.late = late;
    }

    public static int getMaxBooksPerPatron() {
        return MAX_BOOKS_PER_PATRON;
    }

    public static double getLateFee() {
        return LATE_FEE;
    }
}

class Library {
    private ArrayList<LibraryTransaction> transactions;

    public Library() {
        transactions = new ArrayList<>();
    }

    public void borrowBook(Book book, Patron patron, Date dueDate) {
        if (countBooksBorrowed(patron) < LibraryTransaction.getMaxBooksPerPatron()) {
            transactions.add(new LibraryTransaction(book, patron, dueDate));
            System.out.println(patron.getName() + " borrowed " + book.getTitle());
        } else {
            System.out.println(patron.getName() + " has reached the maximum number of books allowed to borrow.");
        }
    }

    public void returnBook(Book book, Patron patron, Date returnDate) {
        for (LibraryTransaction transaction : transactions) {
            if (transaction.getBook() == book && transaction.getPatron() == patron && !transaction.isReturned()) {
                transaction.setReturned(true);
                if (returnDate.after(transaction.getDueDate())) {
                    transaction.setLate(true);
                    double daysLate = (returnDate.getTime() - transaction.getDueDate().getTime()) / (1000 * 60 * 60 * 24);
                    double lateFee = LibraryTransaction.getLateFee() * daysLate;
                    System.out.println("Book returned late. Late fee: $" + lateFee);
                } else {
                    System.out.println("Book returned on time.");
                }
                return;
            }
        }
        System.out.println("Transaction not found. Book may not be borrowed or already returned.");
    }

    private int countBooksBorrowed(Patron patron) {
        int count = 0;
        for (LibraryTransaction transaction : transactions) {
            if (transaction.getPatron() == patron && !transaction.isReturned()) {
                count++;
            }
        }
        return count;
    }
}

public class Libraries {
    public static void main(String[] args) {
        Author author1 = new Author("J.K. Rowling");
        Book book1 = new Book("Blue Monkeys", author1);
        Patron patron1 = new Patron("Mutijima Eloi");

        Library library = new Library();
        library.borrowBook(book1, patron1, new Date(2024, 3, 3));
        library.returnBook(book1, patron1, new Date(2024, 3, 6));
    }
}
