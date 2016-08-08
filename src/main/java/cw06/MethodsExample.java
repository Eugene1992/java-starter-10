package cw06;

public class MethodsExample {
    public static void main(String[] args) {
        printSequence(0, 10, 1);
        printSequence(5, 10, 2);
    }

    static void printSequence(int start, int end, int step){
        for (int i = start; i < end; i+=step) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
