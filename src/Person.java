public class Person {
    String name;
    String ID;
    int age;
    String login;
    String password;
    Role role;
    Person(){
        this.role = Role.MEMBER;
    }
    Person(String name, String ID, int age, String login, String password, Role role){
        this.name = name;
        this.ID = ID;
        this.age = age;
        this.login = login;
        this.password = password;
        this.role = role;
    }
    public void display(){
        System.out.println("Name: " + name + "\nID: " + ID + "\nAge: " + age + "\nRole: " + role);
    }
}
