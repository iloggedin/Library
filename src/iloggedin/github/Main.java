package iloggedin.github;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.choices(new Scanner(System.in));
    }

    public void choices(Scanner scanner){
        System.out.println("Enter your book title: ");
        String title = scanner.nextLine();
        System.out.println("Now just the author: ");
        String author = scanner.nextLine();
        System.out.println("Now just the price: ");
        float price = scanner.nextFloat();
        Book book = new Book(title, author, price);
        System.out.println("Your book has been added succesfully! " + book);
    }
}