package array.ex;

import java.util.Scanner;

public class ArrayEx4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        System.out.println("5개의 정수를 입력하세요: ");
        for (int i = 0; i < 5; i++) {
            sum += scan.nextInt();
        }
        double avg = (double) sum / 5;

        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
    }
}
