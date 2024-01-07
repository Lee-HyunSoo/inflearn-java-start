package scanner.ex;

import java.util.Scanner;

public class ScannerEx1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("당신의 이름을 입력하세요: ");
        String name = scan.nextLine();

        System.out.print("당신의 나이를 입력하세요: ");
        int age = scan.nextInt();

        System.out.println("이름: " + name + " 나이: " + age);
    }
}
