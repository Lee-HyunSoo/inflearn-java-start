package method.ex;

public class MethodEx1 {

    public static void main(String[] args) {
        int cnt = 3;
        int sum1 = sum(1, 2, 3);
        double avg1 = average(sum1, cnt);
        System.out.println("avg1 = " + avg1);

        int sum2 = sum(15, 25, 35);
        double avg2 = average(sum2, cnt);
        System.out.println("avg2 = " + avg2);

    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static double average(int sum, int cnt) {
        return (double) sum / cnt;
    }
}
