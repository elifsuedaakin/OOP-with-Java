import java.util.ArrayList;

public class Library {
    private ArrayList<book> books=new ArrayList<>(); 
    
    public void addBook(book book1){
        books.add(book1);
        System.out.println(book1.getBook_name()+"kütüphaneye eklendi");
    }
    public void BorrowBook(String book_name){
        for(book book1: books){
            if(book1.getBook_name().equals(book_name) && book1.isIsBorrowed()){
                book1.borrow();
                System.out.println(book_name+"ödünç alındı");
                return;
            }
        }
             System.out.println("iade edilecek kitap bulunamadı");
    }
    public void returnBook(String book_name){
        for(book book1:books){
            if(book1.getBook_name().equals(book_name)&& !book1.isIsBorrowed()){
                book1.returnBook();
                System.out.println(book_name+"iade edildi");
                return;
            }
        }
        System.out.println("iade edilecek kitap bulunamadı");
    }
}
