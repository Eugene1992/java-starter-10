package hw4;
public class Main {
    public static void main(String[] args) {
nearNumber(4, 15);

    }
    static void nearNumber(int start, int end){
        int start1;
        int end1;
        if (start < 10) {
            start1 = 10 - start;

        } else {
            start1 = start - 10;
        }
        if (end < 10) {
            end1 = 10 - end;
        } else {
            end1 = end - 10;
        }
        if (start1 > end1) {
            System.out.print("Число b ближе к 10.");
        } else {
            System.out.print("Число a ближе к 10.");
        }
        if (start1 == end1) {
            System.out.print("Число a и b одинаково близки к 10.");
        }

    }
}

   /*   Задание 7
    Используя IntelliJ IDEA, создайте класс Calculator.
    Напишите программу - консольный калькулятор.
    Введите с консоли две переменные. Предложите пользователю ввести знак арифметической операции.
    Для организации выбора алгоритма вычислительного процесса, используйте оператор switch.
    Выведите на экран результат выполнения арифметической операции.
    В случае использования операции деления, организуйте проверку попытки деления на ноль.
    И если таковая имеется, то отмените выполнение арифметической операции и уведомите об ошибке
    пользователя.

            Задание 8
    Используя IntelliJ IDEA, создайте класс Interval.
    Напишите программу определения, попадает ли введенное пользователем число от 0 до 100 в числовой
    промежуток [0 - 14] [15 - 35] [36 - 50] [50 - 100]. Если да, то укажите, в какой именно промежуток.
    Если пользователь указывает число не входящее ни в один из имеющихся числовых промежутков, то
    выводится соответствующее сообщение.*/

