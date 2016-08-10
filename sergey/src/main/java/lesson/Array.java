package lesson;

/**
 * Created by Student on 8/10/2016.
 */
public class Array {
    public static void main(String[] args) {
        System.out.println(getMax(new int[]{2, 5, -5, 9, 23, 12}));
    }

    static int getSum(int[] arr) {
        int sum = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            sum = arr[i] + sum;
        }
        return sum;
    }
    static int getMax(int[] arr){
        int max = arr[0];
        for(int i = arr.length - 1; i >= 0; i--){
            if( max < arr[i]){
            max = arr[i];
            }
        }
        return max;
    }

}
