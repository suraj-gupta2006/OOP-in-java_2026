import java.util.Scanner;

public class User {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("suraj gupta");

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your Roll: ");
        int roll = sc.nextInt();

        System.out.print("Enter your Age: ");
        int age = sc.nextInt();

        System.out.println("Hello " + name +
                           ", your roll is " + roll +
                           " and you are " + age +
                           " years old.");

        sc.close();
    }
}