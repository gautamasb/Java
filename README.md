# Java

The library management system should have multiple methods to add a book to the library, such as addBook(Book book), addBook(String title, String author), addBook(int ISBN, String title, String author). These methods should have different parameters but the same name, demonstrating function overloading.

The library management system should also have a method to search for a book in the library. The parent class should have a basic search function, while child classes can override this method to provide more specific search options, such as searchByAuthor() or searchByISBN().

Create a class "Book" with default and parameterized constructors, using at least 5 variables of different data types (e.g. ISBN, title, author, publication year, and genre). Use getters and setters to access these variables.

Create a class "Library" with a static variable to keep track of the total number of books in the library, and a final variable to represent the maximum number of books the library can hold.

Create classes for different types of books, such as Novel, Comic, and ReferenceBook, which will inherit from the Book class and add additional attributes and methods specific to each type.

Create an abstract class "BookReader" with methods such as readBook(), returnBook(), and borrowBook(). Create a class "LibraryMember" that implements this abstract class, adding a unique ID for each member.

Create an interface "Lendable" with methods such as lendBook() and returnBook(). Create classes for different types of lendable items, such as Books and DVDs, which will implement the interface and show runtime polymorphism.

Use try-catch-finally blocks to handle exceptions in the program, such as when a book cannot be found in the library or a library member tries to borrow more books than they are allowed.
