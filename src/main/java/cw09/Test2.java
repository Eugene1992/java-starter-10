package cw09;

public class Test2 {
    public static void main(String[] args) {

        int[] arr = new int[]{2, 5, 3, 6};
        int sum1 = getSumFromArray(arr);
        System.out.println(sum1);

        int sum2 = getSumFromArray(new int[]{2, -3, 6, 4});
        System.out.println(sum2);

        int sum3 = getSumFromArray(new int[]{2, 5, 3, -12, 6, 3}, 3);
        System.out.println(sum3);
    }

    static int getMaxFromTwo(int a, int b){
        if (a == 5 && b == 10) {
            return 1;
        } else {
            return 0;
        }
    }

    static int getSumFromArray(int[] arr){
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    static int getSumFromArray(int[] arr, int fromIndex){
        int sum = 0;
        for (int i = fromIndex; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
