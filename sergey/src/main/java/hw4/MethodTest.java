package hw4;

public class MethodTest {
    public static void main(String[] args) {
        sumOfRange(2, 10);
    }

    static void sumOfRange(int start, int end) {
        int number = 0;
        for (int i = start; i < end; i++) {
            number = number + i;
        }
        System.out.print(number);

    }
}
