import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String lower = input.toLowerCase();
        String rev = "";
        System.out.println("suraj gupta");
        for (int i = lower.length() - 1; i >= 0; i--) {
            rev += lower.charAt(i);
        }
        if (lower.equals(rev)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    
        sc.close();
    }
}