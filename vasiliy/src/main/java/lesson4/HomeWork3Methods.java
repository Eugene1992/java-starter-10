package lesson4;

/**
 * Задание 3
 Создать программу, выводящую на экран ближайшее к 10 из двух чисел, введенных с консоли.
 Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.
 */
public class HomeWork3Methods {
    public static void main(String[] args) {
        closestToTen(8.5, 11.45);

    }
    static void closestToTen(double b, double c){

        if ((b == 10) & (c != 10)) {
            System.out.println("Number closest to the 10 is " + b);
        } else if ((c == 10) & (b != 10)) {
            System.out.println("Number closest to the 10 is " + c);
        } else if (b == c) {
            System.out.println("Numbers b and c have the same distance from the 10 from each side, value of each number is " + b);
        } else if ((b > 10) & (c > 10)) {
            if ((b - 10) < (c - 10)) {
                System.out.println("Number closest to the 10 is " + b);
            } else {
                System.out.println("Number closest to the 10 is " + c);
            }
        } else if ((b < 10) & (c < 10)) {
            if ((10 - b) < (10 - c)) {
                System.out.println("Number closest to the 10 is " + b);
            } else {
                System.out.println("Number closest to the 10 is " + c);
            }
        } else if ((b > 10) & (c < 10)) {
            if ((b - 10) < (10 - c)) {
                System.out.println("Number closest to the 10 is " + b);
            } else {
                System.out.println("Number closest to the 10 is " + c);
            }
        } else if ((b < 10) & (c > 10)) {
            if ((10 - b) < (c - 10)) {
                System.out.println("Number closest to the 10 is " + b);
            } else {
                System.out.println("Number closest to the 10 is " + c);
            }
        }

    }
}
