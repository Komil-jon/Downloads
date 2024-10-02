import java.util.ArrayList;
import java.util.List;

public class Member extends Person{
    private String memberID;
    private String title;
    private final List<Book> borrowedBooks;
    private final List<Book> allBooks;
    Member(String memberID){
        super();
        this.memberID = memberID;
        this.borrowedBooks = new ArrayList<>();
        this.allBooks = new ArrayList<>();
        this.role = Role.MEMBER;
    }
    Member(String memberID, String title){
        super();
        this.memberID = memberID;
        this.title = title;
        this.role = Role.MEMBER;
        this.borrowedBooks = new ArrayList<>();
        this.allBooks = new ArrayList<>();
    }
    public void borrowBook(Book book){
        if (book.isAvailableBook()){
            if (borrowedBooks.size() < 5) {
                borrowedBooks.add(book);
                allBooks.add(book);
                book.borrowBook();
            }
        } else{
            System.out.println("Book is unavailable!");
        }
    }
    public void returnBook(String bookID){
        for (Book book : borrowedBooks){
            if (book.getBookID().equals(bookID)){
                book.returnBook();
                return;
            }
        }
        System.out.println("Book is not found!");
    }
    public void viewBorrowedBooks(){
        for (Book current : borrowedBooks){
            current.displayBook();
        }
    }
}
