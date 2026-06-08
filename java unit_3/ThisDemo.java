class Student {
    String name;
    int roll;

    Student(String name, int roll) {
        this.name = name; // 'this.name' is field, 'name' is parameter
        this.roll = roll;
    }

    Student() {
        this("Default", 0); // calls parameterized constructor
    }

    void display() {
        System.out.println("Name: " + this.name + ", Roll: " + this.roll);
    }
}

public class ThisDemo {
    public static void main(String[] args) {
        System.out.println("suraj gupta");
        Student s1 = new Student("Suraj", 21);
        Student s2 = new Student();
        s1.display();
        s2.display();
    }
}