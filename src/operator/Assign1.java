package operator;

public class Assign1 {

    public static void main(String[] args) {
        int a = 5;
        a += 3; // 5 + 3 = 8
        a -= 2; // 8 - 2 = 6
        a *= 4; // 6 * 4 = 24
        a /= 3; // 24 / 8 = 3
        a %= 5; // 8 % 5 = 3
        System.out.println("a = " + a); // 3
    }
}
