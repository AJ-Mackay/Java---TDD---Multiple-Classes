import java.util.ArrayList;

public class Library {

    private ArrayList<Book> library;
    private int capacity;

    public Library(int capacity){
        library = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int bookCount(){
        return this.library.size();
    }

    public void addBook(Book book){
        this.library.add(book);
    }

    public void checkForSpace(Book book){
        if(hasSpace()){
            this.library.add(book);
        }
    }

    public boolean hasSpace(){
        return this.capacity > bookCount();
    }
}
