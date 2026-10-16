import studentInfo.Student;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Rahul", "B.Tech CSE");
        s1.displayInfo();

        System.out.println();

        Student s2 = new Student(102, "Priya", "B.Tech IT");
        s2.displayInfo();
    }
}