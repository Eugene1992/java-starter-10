package lesson5.homeWork;

import java.util.Scanner;

/*8. Создайте программу, вычисляющую факториал натурального числа n, введенного пользователем.
 */
public class HomeWork8 {
    public static void main(String[] args) {
        numbers();
    }

    static void numbers() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number n");
        int n = scan.nextInt();
        int counter = 1;
        int i = 1;
        while (true) {
            if (counter < n) {

                i = (++counter) * i;
            } else if (counter == n) {
                System.out.println(+i);
                break;
            }
        }


    }


}

