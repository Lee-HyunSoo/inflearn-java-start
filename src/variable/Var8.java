package variable;

public class Var8 {

    public static void main(String[] args) {
        // 정수
        byte b = 127; // -128 ~ 127 (1byte, 2^8)
        short s = 32767; // -32,768 ~ 32,767 (2byte, 2^16)
        int i = 2147483647; // -2,147,483,648 ~ 2,147,483,647 (4byte, 약 21억, 2^32)

        // -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 (8byte, 2^64)
        long l = 922337203685477587L;

        // 실수
        float f = 10.0f; // 4byte
        double d = 10.0; // 8byte
    }
}
