package cw06;

public class HW4 {
    public static void main(String[] args) {
        printFourNumbersSequence();
    }

    /**
     * 1. Создайте программу, выводящую на экран все четырёхзначные числа
     * последовательности 1000 1003 1006 1009 1012 1015 ….
     */
    static void printFourNumbersSequence(){
        for (int i = 1000; i < 10000; i+=3) {
            System.out.print(i + " ");
        }
    }


}
