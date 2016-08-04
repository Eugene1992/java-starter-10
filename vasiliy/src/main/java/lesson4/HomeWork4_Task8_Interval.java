package lesson4;

/**
 * Created by Advantis on 04.08.2016.
 */
public class HomeWork4_Task8_Interval {
    public static void main(String[] args) {
        /*Задание 8
        Используя IntelliJ IDEA, создайте класс Interval.
        Напишите программу определения, попадает ли введенное пользователем число от 0 до 100 в числовой
        промежуток [0 - 14] [15 - 35] [36 - 50] [50 - 100]. Если да, то укажите, в какой именно промежуток.
                Если пользователь указывает число не входящее ни в один из имеющихся числовых промежутков, то
        выводится соответствующее сообщение.*/
        byte a = 50;
        if((a>=0)&(a<=14)){
            System.out.println("Value 'a' is in the interval [0-14]");
        }else if((a>=15)&(a<=35)){
            System.out.println("Value 'a' is in the interval [15-35]");
        }else if((a>=36)&(a<=50)) {
            System.out.println("Value 'a' is in the interval [36-50]");
        }else if((a>=51)&(a<=100)) {
            System.out.println("Value 'a' is in the interval [51-100]");
        }else{
            System.out.println("Value 'a' is out of the interval [0-100]");
        }
    }
}
