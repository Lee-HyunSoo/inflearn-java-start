package operator;

public class Logical2 {

    public static void main(String[] args) {
        int a = 15;
        // a 는 10 보다 크고 20 보다 작다.
//        boolean result = a > 10 && a < 20; // (a > 10) && (a < 20)
        boolean result = 10 < a && a < 20; // 같은 결과지만 코드가 읽기 좀더 편할 수도 있다.
        System.out.println("result = " + result); // true
    }
}
