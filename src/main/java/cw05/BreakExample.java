package cw05;

public class BreakExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 7) break;
            System.out.print(i + " ");
        }
    }
}
