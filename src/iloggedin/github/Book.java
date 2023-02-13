package iloggedin.github;

public class Book {
    private final String author;
    private final String title;
    private final float price;
    public Book(String title, String author, float price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString(){
        return "\ntitle: " + title + "\nauthor: " + author + "\nprice: " + price;
    }
}
