package lesson4;

/**
 * Задание 2
 * Создать программу, проверяющую и сообщающую на экран, является ли введенное с
 * консоли целое число, чётным либо нечётным.
 */
public class HomeWork2Methods {
    public static void main(String[] args) {
        pairOdd(6);
    }
    static void pairOdd (int number){
        if ((number % 2) == 0) {
            System.out.println("pair number = " + number);
        } else {
            System.out.println("odd number = " + number);
        }

    }
}

