package Library;

public class Book {
    private String Isbn;
    private String Author;
    private String Title;
    private boolean isBorrowed;

    public Book(String isbn, String author, String title) {

        this.Author = author;
        this.Title = title;
        this.Isbn = isbn;
        this.isBorrowed = false;
    }

    public String getIsbn() {
        return Isbn;
    }

    public String getAuthor() {
        return Author;
    }

    public String getTitle() {
        return Title;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

     public void BorrowBook(){
        if(!isBorrowed){
            isBorrowed = true;
            System.out.println("Book has been Borrowed");
        }else{
            System.out.println("Book has been already Borrowed");
        }
     }

     public void returnBook(){
        if (isBorrowed){
            isBorrowed = false;
            System.out.println("Book has been returned");
        }
        else {
            System.out.println("Book has not returned");
        }
     }


    @Override
    public String toString() {
        return "Book{" +
                "Isbn='" + Isbn + '\'' +
                ", Author='" + Author + '\'' +
                ", Title='" + Title + '\'' +
                ", isBorrowed=" + isBorrowed +
                '}';
    }
}
