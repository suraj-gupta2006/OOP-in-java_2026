public class JaggedArraySum {
    public static void main(String[] args) {
        int[][] jagged = {
            {2, 5, 7},
            {1, 9},
            {4, 6, 8, 3}
        };

        for (int i = 0; i < jagged.length; i++) {
            int rowSum = 0;
            System.out.print("Row " + (i + 1) + ": ");
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
                rowSum += jagged[i][j];
            }
            System.out.println("=> Sum = " + rowSum);
            System.out.println("suraj gupta");
        }
    }
}