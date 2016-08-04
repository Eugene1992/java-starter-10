package hw4;
public class Main1 {
    public static void main(String[] args) {


        double a = 228;
        double b = 420;
        double c = 1337;
        if (a > b) {
            if (a > c){
                System.out.println("a самое большое число.");
            }
        }
        if (b > a) {
            if (b > c){
                System.out.println("b самое большое число.");
            }
        }
        if (c > a) {
            if (c > b){
                System.out.println("c самое большое число.");
            }
        }
    }
}