package lesson3;

public class Task1 {
    public static void main(String[] args) {
        int b = 110_1011; //110_1011
        int bb = 10000000 + b;


        int b7 = (bb) / 10000000;
        int b6 = (bb) / 1000000 % 10 * 64;
        int b5 = (bb) / 100000 % 10 * 32;
        int b4 = (bb) / 10000 % 10 * 16;
        int b3 = (bb) / 1000 % 10 * 8;
        int b2 = (bb) / 100 % 10 * 4;
        int b1 = (bb) / 10 % 10 * 2;
        int b0 = (bb) / 1 % 10;


        int number = b0 + b1 + b2 + b3 + b4 + b5 + b6;
        System.out.println(+number);


    }
}
