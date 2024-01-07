package casting;

public class Casting3 {

    public static void main(String[] args) {
        long maxIntValue = 2147483647; // int 최고 값
        long maxIntOver = 2147483648L; // int 최고 값 + 1
        int intValue = 0;

        intValue = (int) maxIntValue; // 형변환
        System.out.println("maxIntValue casting = " + intValue); // 2147483647

        intValue = (int) maxIntOver; // int 의 범위를 넘어선 값 형변환
        System.out.println("maxIntOver casting = " + intValue); // -2147483648
        // int 를 넘으면 시계가 도는 것 처럼 int의 가장 작은 범위부터 다시 시작한다. -> 오버플로우
    }
}
