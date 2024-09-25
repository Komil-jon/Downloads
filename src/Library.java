import java.util.List;

public class Library {
    private String name;
    private String location;
    public List<Book> catalog;
    private List<Member> members;
    List<Librarian> librarians;
    public void registerLibrarian(Member member){
        for (Member current : members){
            if (current.login.equals(member.login)){
                System.out.println("Invalid login credentials!");
                return;
            }
        }
        members.add(member);
    }
    public void addLibrarian(Librarian librarian){
        for (Librarian current : librarians){
            if (current.login.equals(librarian.login)){
                System.out.println("Invalid login credentials!");
                return;
            }
        }
        librarians.add(librarian);
    }
    public List<Member> getMembers(){
        return members;
    }
    public List<Librarian> getLibrarians(){
        return librarians;
    }
    public List<Book> getCatalog(){
        return this.catalog;
    }
}
