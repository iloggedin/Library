package iloggedin.github;
import java.util.*;

public class Library{
    Book book;
    private final List<Book> books;
    public Library(){
        books = new ArrayList<>();
    }

    public Book newBook(Scanner scanner){
        System.out.println("Enter your book's title: ");
        String title = scanner.nextLine();
        System.out.println("Now the author please: ");
        String author = scanner.nextLine();
        System.out.println("Lastly we need the price: ");
        float price = scanner.nextFloat();
        Book book = new Book(title, author, price);
        System.out.println("Your book has been added succesfully! " + book);
        return book;
    }
    public void showBook(){
        books.add(book);
    }
}
