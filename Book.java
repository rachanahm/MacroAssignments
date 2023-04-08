import java.util.ArrayList;

public class Book {
    private String title;
    private Author author;
    private String ISBN;
    private String publisher;
    
    public Book(String title, Author author, String ISBN, String publisher) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publisher = publisher;
    }
    
    public String getTitle() {
        return title;
    }
    
    public Author getAuthor() {
        return author;
    }
    
    public void setAuthor(Author author) {
        this.author = author;
    }
    
    public String getISBN() {
        return ISBN;
    }
    
    public String getPublisher() {
        return publisher;
    }
}

 class Author {
    private String name;
    private String email;
    private ArrayList<Book> books;
    
    public Author(String name, String email) {
        this.name = name;
        this.email = email;
        this.books = new ArrayList<Book>();
    }
    
    public String getName() {
        return name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void addBook(Book book) {
        books.add(book);
    }
}