import java.util.NavigableMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to NUU library");
        Library library = new Library("NewUU", "Tashkent");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.toString();

        System.out.println("Enter your ID: ");
        String ID = scanner.toString();

        System.out.println("1. Login as ADMIN");
        System.out.println("2. Login as Librarian");
        System.out.println("3. Login as Member");
        System.out.println("4. Continue as Guest");
        System.out.println("0. Exit ");

        int option = scanner.nextInt();

        if (option == 1){
            Librarian user = new Librarian(ID, name, library);
            Book book = new Book("1234567890", "Title", "Author");
            user.addBook(book);
            Member member = new Member("1", "title");
            user.issueBook("1234567890", member);
            member.viewBorrowedBooks();
        }
        if (option == 2){
            Librarian user = new Librarian(ID, name, library);
        }
        if (option == 3){
            Member user = new Member(ID, name);
        }
        if (option == 4){
            Guest user = new Guest(name);
        }
        if (option == 0){
            return;
        }
    }
}