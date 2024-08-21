package Library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books;

    public Library(){
        this.books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
        System.out.println("The Book \"" + book.getTitle()+ "\" Has been added to Library");
    }

   public void removeBook(String Isbn){
        Book bookstoRemove = FindBooksByIsbn(Isbn);
        if (bookstoRemove==null){
            books.remove(bookstoRemove);
            System.out.println("The Book"+bookstoRemove.getTitle()+"Has been removed");
        }
        else{
            System.out.println("Book has not removed");
        }
   }

    private Book FindBooksByIsbn(String isbn) {
        for(Book book : books){
            if (book.getIsbn().equals(isbn)){
                System.out.println("The Book has find");
                return  book;
            }
           }
        return null;
        }

    public void borrowBook(String ISBN) {
        Book book = FindBooksByIsbn(ISBN);
        if (book != null) {
            book.BorrowBook();
        } else {
            System.out.println("The book with ISBN " + ISBN + " is not found in the library.");
        }
    }

    public void returnBook(String ISBN) {
        Book book = FindBooksByIsbn(ISBN);
        if (book != null) {
            book.returnBook();
        } else {
            System.out.println("The book with ISBN " + ISBN + " is not found in the library.");
        }
    }

    public void displayAvailableBooks() {
        System.out.println("Available books in the library:");
        for (Book book : books) {
            if (!book.isBorrowed()) {
                System.out.println("- " + book.getTitle() + " by " + book.getAuthor() + " (ISBN: " + book.getIsbn() + ")");
            }
        }
    }
    }



