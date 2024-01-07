package cond.ex;

public class ExchangeRateEx {

    public static void main(String[] args) {
        int dollar = 10;

        if (dollar < 0) {
            System.out.println("잘못 된 금액입니다.");
        } else if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else {
            int won = dollar * 1300;
            System.out.println("환전 금액은 (계산 된 원화 금액) 입니다. : " + won);
        }
    }
}
