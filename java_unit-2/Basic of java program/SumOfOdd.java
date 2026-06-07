public class SumOfOdd {
    public static void main(String[] args) {
        int[] arr = {12, 7, 8, 9, 19, 5};
        int sum = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                continue; // skip even numbers
            }
            sum += num;
        }
        System.out.println("Sum of odd integers = " + sum);
        System.out.println("suraj gupta");
    }
}