package cw06;

public class LogicOR {
    public static void main(String[] args) {
        if (10 > 5 || 10 > 100){
            System.out.println("True");
        }

        if (10 > 5 || 10 % 0 == 0){
            System.out.println("True");
        }

        if (10 > 5 | 10 % 0 == 0){
            System.out.println("True");
        }

        if (10 > 5 || 10 > 100 && 10 == 10 & 10 > 6){
            System.out.println("True");
        }
    }
}
