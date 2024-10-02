import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private String location;
    public List<Book> catalog;
    private List<Member> members;
    private List<Librarian> librarians;
    Library(String name, String location){
        this.name = name;
        this.location = location;
        this.catalog = new ArrayList<>();
        this.members = new ArrayList<>();
        this.librarians = new ArrayList<>();
    }
    public void setter(List<Book> catalog, List<Member> members, List<Librarian> librarians){
        this.catalog = catalog;
        this.members = members;
        this.librarians = librarians;
    }
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
