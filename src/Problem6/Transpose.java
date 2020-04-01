package Problem6;

import java.util.Arrays;

public class Transpose {

    public static void main(String[] args) {
//        int arrs[][] = transpose(new int[][]{{1, 2}, {3, 4}});
        int arrs[][] = transpose(new int[][]{ {1,2,3,4}, {5,6,7,8} });

        for (int[] arr: arrs) {
            System.out.println(Arrays.toString(arr));
        }
    }

    static int[][] transpose(int[][] arr){
        int arr2[][] = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr2.length ; i++) {
            for (int j = 0; j < arr2[i].length ; j++) {
                arr2[i][j] = arr[j][i];
            }
        }
        return arr2;
    }

}
