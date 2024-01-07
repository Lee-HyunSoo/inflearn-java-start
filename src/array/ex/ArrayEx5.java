package array.ex;

import java.util.Scanner;

public class ArrayEx5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("입력 받을 숫자의 개수 입력 : ");
        int input = scan.nextInt();

        int sum = 0;
        System.out.println(input + "개의 정수를 입력하세요: ");
        for (int i = 0; i < input; i++) {
            sum += scan.nextInt();
        }
        double avg = (double) sum / input;

        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
    }
}
