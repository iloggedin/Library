package iloggedin.github;

public class Book {
    private String author;
    private String title;
    private float price;
    public Book(String author, String title, float price){
        this.author = author;
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString(){
        return "\nauthor: " + author + "\ntitle: " + title  + "\nprice: " + price;
    }
}
