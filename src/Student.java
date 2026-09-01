public class Student {

    String name;
    int age;

    static String college = "KMIT";

    void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("College: " + college);
    }

    static void displayCollege() {
        System.out.println("College: " + college);
    }
}

class Main {
    public static void main(String[] args) {

        System.out.println("Calling static method:");
        Student.displayCollege();

        Student s1 = new Student();
        s1.name = "Rahul";
        s1.age = 19;

        Student s2 = new Student();
        s2.name = "Arjun";
        s2.age = 20;

        System.out.println("\nFirst Student:");
        s1.displayStudent();

        System.out.println("\nSecond Student:");
        s2.displayStudent();

        Student.college = "JNTUH";

        System.out.println("\nAfter changing static college:");

        System.out.println("First Student:");
        s1.displayStudent();

        System.out.println("\nSecond Student:");
        s2.displayStudent();
    }
}