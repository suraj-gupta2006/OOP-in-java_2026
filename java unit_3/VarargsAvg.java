public class VarargsAvg {
    static double calculateAverage(int... marks) {
        int sum = 0;
        for (int m : marks) sum += m;
        return (double) sum / marks.length;
    }

    public static void main(String[] args) {
        System.out.println("SURAJ gupta");
        double avg6 = calculateAverage(85, 90, 78,25,45,65);
        double avg5 = calculateAverage(70, 80, 90, 85, 95);
        System.out.println("Average of 3 subjects: " + avg6);
        System.out.println("Average of 5 subjects: " + avg5);
    }
}
