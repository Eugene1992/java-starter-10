package cw06;

public class LogicAndByteXOR {
    public static void main(String[] args) {
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(true ^ true);
        System.out.println(false ^ false);

        System.out.println(5 ^ 3);

        /*
           0000 0101
          ^
           0000 0011
           ---------
           0000 0110
        */

        /*
           1 ^ 0 = 1
           0 ^ 1 = 1
           0 ^ 0 = 0
           1 ^ 1 = 0
        */
    }
}
