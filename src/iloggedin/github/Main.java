package iloggedin.github;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.choices(new Scanner(System.in));
    }
    public void choices(Scanner scanner) {
        Library library = new Library();
        System.out.println("what do you wanna do?\n1: Add a book");
        int number = scanner.nextInt();
        switch (number) {
            case 1 -> library.newBook(scanner);
        }
    }
}