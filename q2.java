import java.util.Scanner;
class Book {
    private String bookTitle;
    private String author;
    private String isbn;
    private int num_of_copies;

    public Book() {}

    public Book(String bookTitle, String author, String isbn, int num_of_copies) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.isbn = isbn;
        this.num_of_copies = num_of_copies;
    }

    public void display() {
        System.out.println("Title: " + bookTitle);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Number of copies: " + num_of_copies);
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getNumOfCopies() {
        return num_of_copies;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn()
    {
        return isbn;
    }

    public void reduceCopies(int num) {
        if (num_of_copies >= num) {
            num_of_copies -= num;
            System.out.println("Sold " + num + " copies of " + bookTitle);
        } else {
            System.out.println("Not enough copies of " + bookTitle);
        }
    }

    public void increaseCopies(int num, boolean found)
    {
        if(found)
        {
            System.out.println("Before the number of copies were " + num_of_copies);
            num_of_copies += num;
            System.out.println("After the number of copies were " + num_of_copies);
        }
    }
}

class Bookstore {
    private Book[] books;
    private int size;

    public Bookstore(int size) {
        this.size = size;
        this.books = new Book[size];
        helps_us_to_initialize();
    }

    public void helps_us_to_initialize() {
        // You can set more books based on the size of the array
        books[0] = new Book("The Seven Wonders of the World", "Richard Swain", "Thousand", 5);
        books[1] = new Book("Stranger Things", "Name 1", "Hundred", 5);
        books[2] = new Book("Game of Thrones", "George R. R. Martin", "Ten", 5);
    }

    public void sell(String bookTitle, int num_of_copies) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (books[i].getBookTitle().equals(bookTitle)) {
                found = true;
                books[i].reduceCopies(num_of_copies);
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found");
        }
    }

    public void order(String isbn, int num) {
        boolean found = false;
        for(int i=0; i<3; i++){
            if(books[i].getIsbn().equals(isbn))
            {
                found = true;
                books[i].increaseCopies(num, found);
            }
        }
        if(found == false)
        {
            System.out.println("We could not find that book Please enter the details to add to the store");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the Book Title name");
            String new_name = scanner.nextLine();
            System.out.println("Enter the Author name");
            String new_author = scanner.nextLine();
            System.out.println("Enter the isbn");
            String new_isbn = scanner.nextLine();
            System.out.println("Enter the number of copies");
            int new_copies = scanner.nextInt();
            books[3] = new Book(new_name, new_author, new_isbn, new_copies);
        }
    }

    public void displayBooks() {
        for (int i = 0; i < size; i++) {
            books[i].display();
        }
    }
}

public class q2 {
    public static void main(String[] args) {
        Bookstore bookstore = new Bookstore(4);

        bookstore.sell("Game of Thrones", 2);
        bookstore.order("Ten", 20);
        bookstore.order("three", 5);

        bookstore.displayBooks();

    }
}
