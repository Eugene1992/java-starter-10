package lesson8_9;

/**
 * 2. Вывести все числа одномерного массива в обратном порядке
 */

public class HomeWork2 {
    public static void main(String[] args) {
        int[] array = new int[3];
        array[0] = 3;
        array[1] = 13;
        array[2] = 5;
        getBackCounting(array);
    }
    static int getBackCounting (int[]array){
        for (int i = array.length; i>0; i-- ){
            System.out.println(array[i-1]);
        }
        return 0;
    }

}