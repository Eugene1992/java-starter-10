package lesson5.homeWork;

import java.util.Scanner;

/*
 7. Выведите в консоль "шахматную доску" размер задает пользователь (пробелы не учитывать). Например:
 Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - -
 Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - -
 Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - -
 Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - -
 - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж
 - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж
 - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж
 - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж
 Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - -
 Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - -
 Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - -
 Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - -
 - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж
 - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж
 - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж
 - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж
 Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - -
 Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - -
 Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - -
 Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - -
 - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж
 - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж
 - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж
 - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж
 Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - -
 Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - -
 Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - -
 Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - -
 - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж
 - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж
 - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж
 - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж
 */
public class HomeWork7 {
    public static void main(String[] args) {
        numbers();
    }

    static void numbers() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of ''chess desk'' horizontal size");
        int horizontal = scan.nextInt();
        System.out.println("Please enter the number of ''chess desk'' vertical size");
        int vertical = scan.nextInt();
        String j = "Ж Ж Ж Ж ";
        String minus = "- - - - ";

        int counter = 0;
        int counter4 = 0;
        int counter_vertical = 0;
        while (counter_vertical < vertical) {
            while (counter4 < 4) {
                while (counter < horizontal) {

                    System.out.print(j);
                    counter++;
                    if (counter < horizontal) {
                        System.out.print(minus);
                    }
                    counter++;
                    if (counter >= horizontal) {
                        System.out.println();
                    }

                }
                counter = 0;
                counter4++;
            }
            counter = 0;
            counter4 = 0;
            counter_vertical++;
            if (counter_vertical < vertical) {
                while (counter4 < 4) {
                    while (counter < horizontal & horizontal != 1) {

                        System.out.print(minus);
                        counter++;
                        if (counter < horizontal) {
                            System.out.print(j);
                        }
                        counter++;
                        if (counter >= horizontal) {
                            System.out.println();
                        }

                    }
                    counter = 0;
                    counter4++;
                }
                counter_vertical++;
            }
            counter = 0;
            counter4 = 0;
        }
    }
}

