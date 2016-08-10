package cw07;

public class MethodsExample {
    public static void main(String[] args) {
        getIntervalSum();
    }

    static void getIntervalSum() {
        int i = 556786;

            int i5 = i / 100000 % 10;
            int i4 = i / 10000 % 10;
            int i3 = i / 1000 % 10;
            int i2 = i / 100 % 10;
            int i1 = i / 10 % 10;
            int i0 = i % 10;

            System.out.println(i5);
            System.out.println(i4);
            System.out.println(i3);
            System.out.println(i2);
            System.out.println(i1);
            System.out.println(i0);

    }

    /**
     * 14. Не счастливые номера. Есть 999999 номерных знаков,
     * подсчитать количество знаков содержащих число 13 и вывести их все в консоль
     */
}
