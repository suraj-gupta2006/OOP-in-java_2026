 public class Sum {
    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Error: Please provide two numbers.");
            System.out.println("Usage: java Sum 10 20");
            return;
        }

        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            int sum = num1 + num2;

            System.out.println("Sum = " + sum);

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numbers.");
        }
    }
}