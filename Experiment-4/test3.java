class Teacher extends Person {
    String subject;

    Teacher(String name, String dateOfBirth, String subject) {
        super(name, dateOfBirth);
        this.subject = subject;
    }

    void display() {
        System.out.println("Teacher Name : " + name);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Subject      : " + subject);
    }
}

class Student extends Person {
    String college;
    int year;

    Student(String name, String dateOfBirth, String college, int year) {
        super(name, dateOfBirth);
        this.college = college;
        this.year = year;
    }

    void display() {
        System.out.println("Student Name : " + name);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("College      : " + college);
        System.out.println("Current Year : " + year);
    }
}

public class test3 {
    public static void main(String[] args) {
        System.out.println("--- Teacher Information ---");
        Teacher t = new Teacher("Prof. A. Kumar", "12-05-1978", "Data Structures");
        t.display();

        System.out.println("\n--- Student Information ---");
        Student s = new Student("Rohit Sharma", "24-09-2004", "ITER, SOA University", 2);
        s.display();
    }
}
