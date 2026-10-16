interface Sports {
    void sportsMarks();
}

interface Academics {
    void academicMarks();
}

class Student implements Sports, Academics {
    String name;
    int sports;
    int academic;

    Student(String name, int sports, int academic) {
        this.name = name;
        this.sports = sports;
        this.academic = academic;
    }

    public void sportsMarks() {
        System.out.println("Sports Marks: " + sports);
    }

    public void academicMarks() {
        System.out.println("Academic Marks: " + academic);
    }

    void display() {
        System.out.println("Student Name: " + name);
        sportsMarks();
        academicMarks();
        System.out.println("Total Marks: " + (sports + academic));
    }
}

public class Multiple {
    public static void main(String[] args) {
        Student s = new Student("Ravi", 80, 90);
        s.display();
    }
}