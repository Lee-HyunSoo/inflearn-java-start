package array.ex;

import java.util.Scanner;

public class ArrayEx6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("입력 받을 숫자의 개수 입력 : ");
        int input = scan.nextInt();

        int[] numbers = new int[input];
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        
        System.out.println(input + "개의 정수를 입력하세요: ");
        for (int i = 0; i < input; i++) {
            numbers[i] = scan.nextInt();
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
