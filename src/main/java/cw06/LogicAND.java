package cw06;

public class LogicAND {
    public static void main(String[] args) {
        int i1 = 30;
        int i2 = 15;
        int i3 = 20;

        /*if (i1 > i2) {
            if (i1 > i3) {
                System.out.println("i1 is max number");
            }
        }*/

        if (i1 < i2 && i1 / 0 == 3) { // short scheme
            System.out.println("i1 is max number");
        }

        if (i1 < i2 & i1 / 0 == 3) {  // full scheme
            System.out.println("i1 is max number");
        }

    }
}
