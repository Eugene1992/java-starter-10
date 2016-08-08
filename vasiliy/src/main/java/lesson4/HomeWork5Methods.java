package lesson4;

/**
 * 5. Выведите на экран первые 20 членов последовательности Фибоначчи.
 */
public class HomeWork5Methods {
    public static void main(String[] args) {
        fibonacci();
    }
    static void fibonacci(){
        int i1 = 0;
        int i2 = 1;
        System.out.println(+i1);
        System.out.println(+i2);
        int i3;
        int counter = 0;

        while (counter < 18) {

            i3 = i1 + i2;
            i1 = i2;
            i2 = i3;
            System.out.println(+i3);
            counter++;

        }

    }
}