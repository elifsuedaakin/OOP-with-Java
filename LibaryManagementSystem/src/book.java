
public class book {
    private String book_name;
    private String book_author;
    private String book_isbn;
    private boolean isBorrowed;
    
    public book(String book_name,String book_author,String book_isbn,Boolean isBorrowed){
        this.book_name=book_name;
        this.book_author=book_author;
        this.book_isbn=book_isbn;
        this.isBorrowed=false;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getBook_author() {
        return book_author;
    }

    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }

    public String getBook_isbn() {
        return book_isbn;
    }

    public void setBook_isbn(String book_isbn) {
        this.book_isbn = book_isbn;
    }

    public boolean isIsBorrowed() {
        return isBorrowed;
    }

    public void setIsBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }
    public void borrow(){
        this.isBorrowed=true;
    }
    public void returnBook(){
        this.isBorrowed=false;
    }
}
