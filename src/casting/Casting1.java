package casting;

public class Casting1 {

    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; // int 를 long 에 넣음
        System.out.println("longValue = " + longValue); // 10

        doubleValue = intValue; // int 를 double 에 넣음
        System.out.println("doubleValue = " + doubleValue); // 10.0

        doubleValue = 20L; // long 을 double 에 넣음
        System.out.println("doubleValue2 = " + doubleValue); // 20.0
    }
}
