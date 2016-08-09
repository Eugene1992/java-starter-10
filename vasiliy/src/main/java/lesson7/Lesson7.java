package lesson7;

/**
 * Created by Advantis on 08.08.2016.
 */
public class Lesson7 {
    public static void main(String[] args) {
        printSequence(2, 5);
    }

    static void printSequence(int from, int to){
        int sum = 0;
        for (int i = from; i <= to; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}

