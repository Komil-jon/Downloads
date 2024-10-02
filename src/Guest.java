import java.util.List;

public class Guest extends Person{
    Library library;
    String name;
    Guest(String name){
        super();
        this.name = name;
    }
    public void viewCatalog(){
        List<Book> list = library.getCatalog();
        for( Book book : list){
            book.displayBook();
        }
    }
    public Member register(String memberID, String title){
        return new Member(memberID, title);
    }
}
