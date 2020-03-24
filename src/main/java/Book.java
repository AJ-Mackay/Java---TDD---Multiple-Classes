import java.util.ArrayList;

public class Book {

    private String title;
    private String author;
    private String genre;
    private ArrayList<Book> library;

    public Book(String title, String author, String genre){
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.library = new ArrayList<Book>();
    }

}
