public class Recursion {
    static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("suraj gupta");
        for (int i = 0; i <= 10; i++)
            System.out.println(i + "! = " + factorial(i));
        System.out.print("Fibonacci(10) = ");
        for (int i = 0; i < 10; i++)
            System.out.print(fibonacci(i) + " ");
        System.out.println();
    }
}