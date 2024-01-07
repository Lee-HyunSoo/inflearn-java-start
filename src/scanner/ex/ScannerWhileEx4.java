package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = "";
        int input = 0, price = 0, quantity = 0, totalPrice = 0;

        while (input != 3) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            input = scan.nextInt();
            scan.nextLine();

            switch (input) {
                case 1 -> {
                    System.out.print("상품 명을 입력하세요: ");
                    name = scan.nextLine();

                    System.out.print("상품의 가격을 입력하세요: ");
                    price = scan.nextInt();

                    System.out.print("구매 수량을 입력하세요: ");
                    quantity = scan.nextInt();
                    scan.nextLine();

                    System.out.println("상품명: " + name + " 가격: " + price +
                            " 수량: " + quantity + " 합계: " + price * quantity);
                    totalPrice += price * quantity;
                }
                case 2 -> System.out.println("총 비용: " + totalPrice);

                case 3 -> System.out.println("프로그램을 종료합니다.");
            }
        }
    }
}
