package cw09;

public class Test {
    public static void main(String[] args) {
        int[] arr = getSomething(); // {1, 2, 3}

        int a = arr[0];
        int b = arr[1];
        int c = arr[2];

        System.out.println(arr[0]);
        System.out.println(b);
        System.out.println(c);
    }

    static int[] getSomething() {
        int a = 1;
        int b = 2;
        int c = a + b;
        return new int[]{a, b, c};
    }
}
