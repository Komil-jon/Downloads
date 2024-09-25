import java.util.List;

public class Guest {
    Library library;
    public void viewCatalog(){
        List<Book> list = library.getCatalog();
        for( Book book : list){
            book.displayBook();
        }
    }
    public Member register(String memberID, String title){
        Member member = new Member(memberID, title);
        return member;
    }
}
