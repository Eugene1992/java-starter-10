package lesson5.homeWork;

/*2. Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….*/
public class HomeWork2 {
    public static void main(String[] args) {
        fiftyFiveNumbers();
    }
    static void fiftyFiveNumbers (){
        for (int i = 1; i <= 1 + 2 * 54; i = i + 2) {
            System.out.println("" + i + " ");
        }
    }
}
