package lesson8_9;

/**
 * 1. Вывести в консоль все парные числа одномерного массива
 */
public class HomeWork1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 3;
        arr[1] = 2;
        arr[2] = 5;
        arr[3] = 4;
        arr[4] = 6;

    getPairNumbers(arr);
    }

    static int getPairNumbers(int[] arr){
        for (int i = 0; i < arr.length; i++){
            if (arr[i]%2==0){
                System.out.println(arr[i]);
            }

        }
        return 0;
    }

}
