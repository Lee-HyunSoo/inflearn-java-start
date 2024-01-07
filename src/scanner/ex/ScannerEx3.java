package scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("음식 이름을 입력해주세요: ");
        String foodName = scan.nextLine();

        System.out.print("음식 가격을 입력해주세요: ");
        int foodPrice = scan.nextInt();

        System.out.print("음식 수량을 입력해주세요: ");
        int foodQuantity = scan.nextInt();

        int totalPrice = foodPrice * foodQuantity;

        System.out.println(foodName + " " + foodQuantity + "를 주문하셨습니다. 총 가격은 " + totalPrice + "원 입니다.");
    }
}
