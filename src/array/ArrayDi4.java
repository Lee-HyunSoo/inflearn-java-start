package array;

public class ArrayDi4 {

    public static void main(String[] args) {
        // 2 * 3 2차원 배열 선언
        int[][] arr = new int[2][3];

        int num = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = num++;
            }
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
