package hw4;
//Задание 5
//    Задано четыре переменных, найти и вывести на экран вторую по величине.
public class Main2 {
    public static void main(String[] args) {

        double a = 228;
        double b = 420;
        double c = 1337;
        double d = 488;
        if (a > b) {
            if (a > c) {
                if (a < d) {
                    System.out.println("a второе по величине число.");
                }
            }
        }
        if (b > a) {
            if (b > c) {
                if (b < d) {
                    System.out.println("b второе по величине число.");
                }
            }
        }
        if (c > b) {
            if (c > a) {
                if (c < d) {
                    System.out.println("c второе по величине число.");
                }
            }
        }
        if (d > b) {
            if (d > c) {
                if (d < a) {
                    System.out.println("d второе по величине число.");
                }
            }
        }

            }

        }
