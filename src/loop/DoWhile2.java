package loop;

public class DoWhile2 {

    public static void main(String[] args) {
        int i = 10;

        do {
            System.out.println("현재 숫자는 : " + i);
            i++;
            System.out.println("i = " + i);
        } while (i < 3);
    }
}
