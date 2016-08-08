package lesson4;

/**
 * Задание 4
 Задано три переменных, найти и вывести на экран переменную с максимальным значением
 (значения всех переменных разные).
 */
public class HomeWork4Methods {
    public static void main(String[] args) {

        theBiggestValue(23, 32, 0);
    }
    static void theBiggestValue(int d, int e, int f){
        if ((d != e) & (d != f) & (e != f)) {
            if ((d > e) & (d > f)) {
                System.out.println("The biggest value is d = " + d);
            } else if ((e > d) & (e > f)) {
                System.out.println("The biggest value is e = " + e);
            } else if ((f > d) & (f > e)) {
                System.out.println("The biggest value is f = " + f);
            }
        } else {
            System.out.println("Numbers cannot be equal");
        }
    }
}
