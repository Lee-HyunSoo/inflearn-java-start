package array;

public class ArrayDi3 {

    public static void main(String[] args) {
        // 2 * 3 2차원 배열 선언
//        int[][] arr = new int[][]{
//                {1, 2, 3},
//                {4, 5, 6}
//        }; // 행 2, 열 3

        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6}
        }; // 행 2, 열 3

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
