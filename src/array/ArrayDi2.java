package array;

public class ArrayDi2 {

    public static void main(String[] args) {
        // 2 * 3 2차원 배열 선언
        int[][] arr = new int[2][3]; // 행 2, 열 3

        arr[0][0] = 1; // 0 행 0 열
        arr[0][1] = 2; // 0 행 1 열
        arr[0][2] = 3; // 0 행 2 열
        arr[1][0] = 4; // 1 행 0 열
        arr[1][1] = 5; // 1 행 1 열
        arr[1][2] = 6; // 1 행 2 열

        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
