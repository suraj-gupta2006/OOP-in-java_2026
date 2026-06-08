class Student {
    static int counter = 0;
    int rollNo;
    String name;

    Student(String name) {
        this.name = name;
        rollNo = ++counter;
    }

    static int getTotalStudents() {
        return counter;
    }

    void display() {
        System.out.println("Roll: " + rollNo + ", Name: " + name);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        System.out.println("SURAJ GUPTA");
        Student s1 = new Student("suraj");
        Student s2 = new Student("gupta");
        Student s3 = new Student("puskar");
        s1.display(); s2.display(); s3.display();
        System.out.println("Total students: " + Student.getTotalStudents());
    }
}