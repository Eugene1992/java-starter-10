package lesson5.homeWork;

/*3. Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….*/
public class HomeWork3 {
    public static void main(String[] args) {
        numbers();
    }

    static void numbers() {
        for (int i = 90; i >= 0; i = i - 5) {
            System.out.println("" + i + " ");
        }
    }
}
