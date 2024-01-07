package array.ex;

import java.util.Scanner;

public class ProductAdminEx {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int maxProduct = 3;
        String[] productNames = new String[maxProduct];
        int[] productPrices = new int[maxProduct];
        int productCount = 0;

        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요: ");
            int input = scan.nextInt();
            scan.nextLine();

            if (input == 1 && productCount == maxProduct) {
                System.out.println("더 이상 상품을 등록할 수 없습니다.");
                continue;
            }
            if (input == 2 && productCount == 0) {
                System.out.println("등록 된 상품이 없습니다.");
                continue;
            }
            if (input == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            switch (input) {
                case 1 -> {
                    System.out.print("상품의 이름을 입력하세요: ");
                    productNames[productCount] = scan.nextLine();

                    System.out.print("상품의 가격을 입력하세요: ");
                    productPrices[productCount] = scan.nextInt();
                    scan.nextLine();

                    productCount++;
                }
                case 2 -> {
                    for (int i = 0; i < productCount; i++) {
                        System.out.println(productNames[i] + ": " + productPrices[i] + "원");
                    }
                }
            }
        }
    }
}
