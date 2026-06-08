public class RecursiveSumOfDigits {
    static int sumOfDigits(int n) {
        if (n == 0)
            return 0;                 // base case
        return (n % 10) + sumOfDigits(n / 10); // last digit + rest
    }

    public static void main(String[] args) {
        System.out.println("SURAJ GUPTA");
        int number = 123456789;
        int result = sumOfDigits(number);
        System.out.println("Sum of digits of " + number + " = " + result);
    }
}