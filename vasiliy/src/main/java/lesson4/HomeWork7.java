package lesson4;

import java.util.Scanner;

/**
 * Задание 7
 * Используя IntelliJ IDEA, создайте класс Calculator.
 * Напишите программу - консольный калькулятор.
 * Введите с консоли две переменные. Предложите пользователю ввести знак арифметической операции.
 * Для организации выбора алгоритма вычислительного процесса, используйте оператор switch.
 * Выведите на экран результат выполнения арифметической операции.
 * В случае использования операции деления, организуйте проверку попытки деления на ноль.
 * И если таковая имеется, то отмените выполнение арифметической операции и уведомите об ошибке
 * пользователя.
 */
 public class HomeWork7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first variable");
        int a = scan.nextInt();
        System.out.println("Please enter second variable");
        int b = scan.nextInt();
        System.out.println("Please enter sign of the arithmetic operation ");
        String k = scan.next();
             /* String addition = "+";
        String subtraction = "-";
        String multiplication  = "*";
        String division = "/";*/
        switch (k) {
            case "+":
                int c = a + b;
                System.out.println(+c);
                break;
            case "-":
                int d = a - b;
                System.out.println(+d);
                break;
            case "*":
                int e = a * b;
                System.out.println(+e);
                break;
            case "/":
                int f = a / b;
                System.out.println(+f);
                break;


        }


        System.out.println("");
    }
}