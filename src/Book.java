public class Book {
    private String bookID;
    private String title;
    private String author;
    private boolean isAvailable;
    Book(String bookID, String title, String author){
        this.bookID = bookID;
        this.author = author;
        this.title = title;
        this.isAvailable = true;
    }
    public void setAvailable(boolean condition){
        this.isAvailable = condition;
    }
    public String getBookID(){
        return this.bookID;
    }
    public boolean isAvailableBook(){
        return this.isAvailable;
    }
    public boolean borrowBook(){
        if (isAvailable){
            isAvailable = false;
            System.out.println("Book is booked successfully!");
            return true;
        } else{
            System.out.println("Book is not available!");
            return false;
        }
    }
    public boolean returnBook(){
        if (isAvailable){
            System.out.println("Book was not borrowed!");
            return false;
        } else{
            isAvailable = true;
            System.out.println("Book is returned successfully!");
            return true;
        }
    }
    public void displayBook(){
        if (isAvailable){
        System.out.println("Book ID: " + bookID + "\nBook title: " + title + "\nBook author: " + author + "\nThe book is available!");
    }
        else{
            System.out.println("Book ID: " + bookID + "\nBook title: " + title + "\nBook author: " + author + "\nThe book is not available!");
        }
    }
}
