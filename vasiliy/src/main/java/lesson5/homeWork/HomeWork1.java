package lesson5.homeWork;

/*1. Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….*/
public class HomeWork1 {
    public static void main(String[] args) {
        plastThree();
    }
    static void plastThree(){
        for (int i = 1000; i <= 9999; i = i + 3) {
            System.out.println("" + i + " ");
        }
    }
}
