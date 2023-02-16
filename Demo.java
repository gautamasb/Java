interface Lendable { //Create an interface "Lendable" with methods such as lendBook() and returnBook(). Create classes for different types of lendable items
    public void lendBook();
    public void returnBook();
}
class Book implements Lendable{   //Create a class Book and declare 5 variable and define default and parametarized constructor
    private int isbn;
    private char title;
    private String author;
    private int year;
    private String genre;
    public Book()
    {
        System.out.println("Default Constructor created..");
    }
    public Book(int isbn,char title,String author,int year,String genre)
    {
        this.isbn=isbn;
        this.title=title;
        this.author=author;
        this.year=year;
        this.genre=genre;
    }
    public int getIsbn() {
        return isbn;
    }
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    public char getTitle() {
        return title;
    }
    public void setTitle(char title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void lendBook()
    {
        System.out.println("Lending the book");
    }
    public void returnBook()
    {
        System.out.println("Returning Book");
    }
    
}
class Library{  //create a class Library to keep track of total no of books and max books that the library can hold
    private static int totalBooks =0;
    private final int maxBooks;
    public Library(int maxBooks){
        this.maxBooks=maxBooks;
    }
    public void addBook(Book book)
    {
        if(totalBooks<maxBooks)
        {
            totalBooks++;
            
        }
        else
        {
            System.out.println("Library is full Dude..");
        }
        
    }
    public void printBook(){
        System.out.println("Total Books = "+totalBooks);
    }
}
class Novel extends Book{ //create classes for different types of books like novel,comic,referenceBook,etc which will inherit the Book class and add additional attributes and methods
    private int interest;
    public Novel(int isbn,char title,String author,String genre,int year,int interest){
        super();
        this.interest=interest;
    }
    public void isItGood(){
        if(interest>8){
            System.out.println("Good Novel:)");
        }
        else
        {
            System.out.println("Not a good novel");
        }
    }
}
class Comic extends Book{
    private int humor;
    public Comic(int isbn,char title,String author,int year,String genre,int humor)
    {
        super();
        this.humor=humor;
    }
    public void isItGoodHumor()
    {
        if(humor>7)
        {
            System.out.println("Good Humor");
        }
        else
        {
            System.out.println("Not Good Humor");
        }
    }
}
 class ReferenceBook extends Book{
    private String publisher;
    public ReferenceBook(int isbn,char title,String author,int year,String genre,String publisher){
        this.publisher=publisher;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    

}
abstract class BookReader{
    public abstract void readBook();
    public abstract void returnBook();
    public abstract void borrowBook();
}
class LibraryMember extends BookReader{
    private int id;
    LibraryMember(int id)
    {
        this.id = id;
    }
    public void readBook(){
        System.out.println("Reading the bood with id : "+id);
    }
    public void returnBook(){
        System.out.println("Returning Book with id :"+id);
    }
    public void borrowBook(){
        System.out.println("Borrowed book with id:"+id);
    }
}
 
public class Demo{
    public static void main(String[] args) {
        Book b = new Book(101,'A',"Santosh",2020,"Romance");
        Book b1 = new Book(102,'B',"Gautam",2021,"Comic");
        Library l1 = new Library(200);
        Novel n = new Novel(101, 'A', "Santosh", "Romance", 2020, 9);
        Comic c = new Comic(102, 'B', "Gautam", 2021, "Comic", 6);
        LibraryMember lb = new LibraryMember(12);
        lb.borrowBook();
        LibraryMember lb1 = new LibraryMember(13);
        lb1.borrowBook();
        lb.readBook();
        lb.returnBook();
        n.isItGood();
        c.isItGoodHumor();
        l1.addBook(b);
        l1.addBook(b1);
        l1.printBook();
    }
}