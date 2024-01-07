package scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("숫자 입력: ");
        int input = scan.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(input + " * " + i + " = " + input * i);
        }
    }
}
