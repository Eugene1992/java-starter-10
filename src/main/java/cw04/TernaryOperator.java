package cw04;

/**
 * Created by deyneko55 on 04.08.16.
 */
public class TernaryOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = a > 5 ? a < 20 ? 1000 : 25 : a == 10 ? 5 : 10;

        /*if (a > 5) {
            if (a < 20) {
                b = 1000;
            } else {
                b = 25;
            }
        } else {
            b = 100;
        } */

        System.out.println(b);
    }
}
