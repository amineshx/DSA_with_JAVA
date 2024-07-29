public class AvgOfThreeNums {
    public static void findAvg(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum / 3;
        System.out.println(avg);
    }

    public static void main(String[] args) {
        // Example values
        findAvg(5, 10, 15);
    }
}
