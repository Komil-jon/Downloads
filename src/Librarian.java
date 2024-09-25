import java.util.List;

public class Librarian extends Person{
    private String librarianID;
    private String name;
    private List<Book> managedBooks;
    private Library library;
    public void addBook(Book book){
        library.getCatalog().add(book);
    }
    public void removeBook(String bookID){
        for (Book currentBook : library.getCatalog()){
            if (currentBook.getBookID().equals(bookID)){
                if (currentBook.isAvailableBook()){
                    library.getCatalog().remove(currentBook);
                    System.out.println("Book is removed!");
                } else{
                    return;
                }
            }
        }
    }
    public void issueBook(String bookID, Member member){
        for (Book currentBook : library.getCatalog()){
            if (currentBook.getBookID().equals(bookID)){
                if (currentBook.isAvailableBook()){
                    member.borrowBook(currentBook);
                    currentBook.setAvailable(false);
                }
            }
        }
    }
    public boolean returnBook(String bookID){
        return true;
    }
}
