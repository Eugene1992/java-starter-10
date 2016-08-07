package lesson5.homeWork;

/*6. Написать программу, которая реализует следующий функционал:
        6.1 Пользователь вводит число в 10-ой системе счисления.
        6.2 Программа выводит сообщение в котором предлагает пользователю перевести данное число в одну из систем счисления на выбор:
        1) в 2-ую
        2) в 8-ую
        3) в 16-ую
        6.3 Пользователь выбирает один из предложенных вариантов, программа выполняет соответствующий перевод числа и выводит
        на экран результат.*/

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number");
        int s = scan.nextInt();
        System.out.println("If you want convert number to the binary number enter 2");
        System.out.println("If you want convert number to the octal number enter 8");
        System.out.println("If you want convert number to the hexadecimal number enter 16");
        int i = scan.nextInt();

        if (i == 2) {
            int a = s;
            String res1 = "";
            while (a > 0) {
                res1 = a % 2 + res1;
                a = a / 2;
            }
            System.out.println("" + res1);
        } else if (i == 8) {


            int b = s;
            String res2 = "";
            while (b > 0) {
                res2 = b % 8 + res2;
                b = b / 8;
            }
            System.out.println("" + res2);
        } else if (i == 16) {
            int c = s;
            int c1;
            String a3 = "A";
            String b3 = "B";
            String c3 = "C";
            String d3 = "D";
            String e3 = "F";
            String f3 = "G";
            String g3 = "H";
            String res3 = "";
            while (c > 0) {
                c1 = c % 16;
                if (c1 < 10) {
                    res3 = c % 16 + res3;
                } else if (c1 == 10) {
                    res3 = a3 + res3;
                } else if (c1 == 11) {
                    res3 = b3 + res3;
                } else if (c1 == 12) {
                    res3 = c3 + res3;
                } else if (c1 == 13) {
                    res3 = d3 + res3;
                } else if (c1 == 14) {
                    res3 = e3 + res3;
                } else if (c1 == 15) {
                    res3 = f3 + res3;
                } else if (c1 == 16) {
                    res3 = g3 + res3;
                }

                c = c / 16;
            }
            System.out.println("" + res3);
        }


    }

}


