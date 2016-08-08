package hw4;
public class Main1 {
    public static void main(String[] args) {
        highNumber(1337, 228, 1488);

    }
        static void highNumber(int first, int second, int third){
            if (first > second) {
                if (first > third) {
                    System.out.println("a самое большое число.");
                }
            }
            if (second > first) {
                if (second > third) {
                    System.out.println("b самое большое число.");
                }
            }
            if (third > first) {
                if (third > second) {
                    System.out.println("c самое большое число.");
                }
            }



    }
    }
