package lesson7;

/**
 * Created by Advantis on 09.08.2016.
 */
public class Lesson7_2 {
    public static void main(String[] args) {
        System.out.println(get13());
    }

    static int get13() {
        int a = 131133;
        int b = 0;
        int c = 0;
        int counter = 0;
        b = a % 1000000;
        c = b / 10000;
        if (c == 13) {
            counter++;
        }
        b = a % 100000;
        c = b / 1000;
        if (c == 13) {
            counter++;
        }
        b = a % 10000;
        c = b / 100;
        if (c == 13) {
            counter++;
        }
        b = a % 1000;
        c = b / 10;
        if (c == 13) {
            counter++;
        }
        b = a % 100;
        c = b / 1;
        if (c == 13) {
            counter++;
        }
        return counter;
    }
}
