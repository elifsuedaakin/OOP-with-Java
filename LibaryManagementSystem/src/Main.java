
public class Main {
    public static void main (String[] args){
        Library library= new Library();
        book book1= new book("harry potter","jk rowlıng","12345",false);
        book book2=new book("kurk mantolu madanno","sabahattin ali","123456",true);
        library.addBook(book1);
        library.addBook(book2);
        
        library.BorrowBook("harry potter");
        library.BorrowBook("kurk mantolu madanno");
        library.returnBook("harry potter");
    }
}
