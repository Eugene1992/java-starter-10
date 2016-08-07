package lesson5.homeWork;

import java.util.Scanner;

/**
 * 9. Выведите на экран все положительные делители натурального числа, введенного пользователем.
 */
public class HomeWork9 {
    public static void main(String[] args) {
        System.out.print("Please enter natural number - ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        System.out.print("Number " + n + " can be divided on - ");
        for (int i = 1; i <= n; i++) {
            if ((n % i) == 0) {

                System.out.print(i + " ");
            }
        }
    }
}
