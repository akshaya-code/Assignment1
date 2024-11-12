package question6;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setter("Alice");

        Student student2 = new Student();
        student2.setter("Bob Smith");

        student1.display();
        System.out.println("Number of characters in name: " + student1.count());

        student2.display();
        System.out.println("Number of characters in name: " + student2.count());
    }
}