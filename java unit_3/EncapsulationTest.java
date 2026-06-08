class Student {
    private String name;
    private int age;

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0)
            this.age = age;
        else
            System.out.println("Age must be positive");
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}

public class EncapsulationTest {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("gupta jee");
        s.setAge(20);
System.out.println("suraj gupta jee");
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}