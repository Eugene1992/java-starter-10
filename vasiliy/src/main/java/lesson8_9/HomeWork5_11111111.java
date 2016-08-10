package lesson8_9;

/**
 * 5. Найти сумму всех элементов в массиве
 */
public class HomeWork5_11111111 {
    public static void main(String[] args) {
        int[] array = new int[3];
        array[0] = 3;
        array[1] = 13;
        array[2] = 5;
        System.out.println(getSumNum(array));
    }
    static int getSumNum(int[] array) {
        int sum = 0;
        for ( int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }
}


