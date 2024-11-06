import java.util.ArrayList;
import java.util.Scanner;

class Book{
    private int bookId;
    private String author;
    private String title;
    private boolean isAvailable;



    public Book(int bookId, String author, String title, boolean isAvailable) {
        this.bookId = bookId;
        this.author = author;
        this.title = title;
        this.isAvailable = isAvailable;
    }

    // Getters and Setters
    public int getBookId() {
        return bookId;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // Method to display book details
    public void displayBookInfo() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }
}

class libray{
   private ArrayList<Book> books;

   public libray(){
       books = new ArrayList<>();
   }

   //method to add book
    public void addBook(Book book){
       books.add(book);
        System.out.println("Book added:" + book.getTitle());
    }

    //method to remove book
    public boolean removeBook(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                books.remove(book);
                System.out.println("Book removed: " + book.getTitle());
                return true;
            }
        }
        System.out.println("Book not found with ID: " + bookId);
        return false;
    }

    //method to remove book
    public Book searchBook(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                return book;
            }
        }
        return null;
    }

    //method to display books
    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("The library is empty.");
            return;
        }
        for (Book book : books) {
            book.displayBookInfo();
            System.out.println("------------------");
        }
    }
}


public class BookManagmentSystem {
    public static void main(String[] args) {
        libray libray = new libray();
        Scanner obj = new Scanner(System.in);
        boolean running = true;

        while (running){
            System.out.println("Library books menu");
            System.out.println("1. Add new book");
            System.out.println("2. Remove the book");
            System.out.println("3. Search the book");
            System.out.println("4. Display all books from library");
            System.out.println("5. Exit the library");
            System.out.print("Choose an option: ");
            int choice = obj.nextInt();
            obj.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Enter the book Id: ");
                    int id = obj.nextInt();
                    obj.nextLine(); // Consume newline
                    System.out.print("Enter Author: ");
                    String author = obj.nextLine();
                    System.out.print("Enter Title: ");
                    String title = obj.nextLine();
                    Book newBook = new Book(id, author, title, true);
                    libray.addBook(newBook);
                    break;

                case 2:
                    System.out.print("Enter Book ID to remove: ");
                    int removeId = obj.nextInt();
                    libray.removeBook(removeId);
                    break;

                case 3:
                    System.out.print("Enter Book ID to search: ");
                    int searchId = obj.nextInt();
                    Book foundBook = libray.searchBook(searchId);
                    if (foundBook != null) {
                        System.out.println("Book found:");
                        foundBook.displayBookInfo();
                    } else {
                        System.out.println("Book not found with ID: " + searchId);
                    }
                    break;

                case 4:
                    System.out.println("Displaying all books in the library:");
                    libray.displayAllBooks();
                    break;

                case 5:
                    running = false;
                    System.out.println("Exiting Library System.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
