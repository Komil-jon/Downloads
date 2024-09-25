public class Person {
    String name;
    String ID;
    int age;
    String login;
    String password;
    Role role;
    public void display(){
        System.out.println("Name: " + name + "\nID: " + ID + "\nAge: " + age + "\nRole: " + role);
    }
}
