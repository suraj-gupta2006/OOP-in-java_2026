public class RecursiveGCD {
    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println("SURAJ GUPTA");
        int num1 = 84, num2 = 81;
        int result = gcd(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " = " + result);
    }
}