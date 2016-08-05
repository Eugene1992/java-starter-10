package lesson4;

/**
 * Created by Advantis on 04.08.2016.
 */
public class HomeWork4_Tasks1_5 {
    public static void main(String[] args) {
       /*Задание 2
        Создать программу, проверяющую и сообщающую на экран, является ли введенное с
        консоли целое число, чётным либо нечётным.
        */
        int a = 5;
        if ((a % 2) == 0) {
            System.out.println("pair number = " + a);
        } else {
            System.out.println("odd number = " + a);
        }
        /*Задание 3
        Создать программу, выводящую на экран ближайшее к 10 из двух чисел, введенных с консоли.
        Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.
        */
        double b = 11.45;
        double c = 11.45;
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
        /*Задание 4
        Задано три переменных, найти и вывести на экран переменную с максимальным значением
        (значения всех переменных разные).*/
        int d = 1;
        int e = 2;
        int f = 3;
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
        /*Задание 5
        Задано четыре переменных, найти и вывести на экран вторую по величине.*/
        int g = 4;
        int h = 2;
        int i = 3;
        int j = 4;
        if ((g > h) & (g > i) & (g > j)) {
            if ((h > i) & (h > j)) {
                System.out.println("The second highest number is h = " + h);
            } else if ((i > j) & (i > h)) {
                System.out.println("The second highest number is i = " + i);
            } else if ((j > h) & (j > i)) {
                System.out.println("The second highest number is j = " + j);
            }
        } else if ((h > i) & (h > j) & (h > g)) {
            if ((i > j) & (i > g)) {
                System.out.println("The second highest number is i = " + i);
            } else if ((j > i) & (j > g)) {
                System.out.println("The second highest number is j = " + j);
            } else if ((g > i) & (g > j)) {
                System.out.println("The second highest number is g = " + g);
            }
        } else if ((i > j) & (i > g) & (i > h)) {
            if ((j > g) & (j > h)) {
                System.out.println("The second highest number is j = " + j);
            } else if ((g > h) & (g > j)) {
                System.out.println("The second highest number is g = " + g);
            } else if ((h > j) & (h > g)) {
                System.out.println("The second highest number is h = " + h);
            }
        } else if ((j > g) & (j > h) & (j > i)) {
            if ((g > h) & (g > i)) {
                System.out.println("The second highest number is g = " + g);
            } else if ((h > g) & (h > i)) {
                System.out.println("The second highest number is h = " + h);
            } else if ((i > g) & (i > h)) {
                System.out.println("The second highest number is i = " + i);
            }
        } else if ((g==h)&(g==i)&(g==j)){
            System.out.println("No second highest number, all numbers are equal = " + i);

        }
    }
}
