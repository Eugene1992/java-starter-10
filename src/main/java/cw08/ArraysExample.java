package cw08;

public class ArraysExample {
    public static void main(String... args) {
        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 15;
        arr[2] = 8;
        arr[3] = -3;
        arr[4] = -46;

        int max1 = getSumOfArray(arr);
        int max2 = getSumOfArray2(2, 5, 6, 43);
    }

    static int getMaxFromFour(int a, int b, int c, int d){
        if (a > b && a > c && a > d){
            return a;
        }
        return a;
    }

    static int getSumOfArray(int[] arr) {
        int sum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static int getSumOfArray2(int... arr) {
        int sum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static int getAverage(int[] arr){
        return (int)(getSumOfArray(arr) / arr.length / 2.0);
    }
}
