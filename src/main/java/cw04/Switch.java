package cw04;

public class Switch {
    public static void main(String[] args) {
        int k = 5;

        /*if (k == 1) {
            System.out.println("k == 1");
        }
        if (k == 2) {
            System.out.println("k == 2");
        }
        if (k == 3) {
            System.out.println("k == 3");
        }
        if (k == 4) {
            System.out.println("k == 4");
        }*/

        switch (k) {
            default:
                System.out.println("Default case...");
            break;

            case 1:
                System.out.println("k == 1");
            break;

            case 2:
                System.out.println("k == 2");
            break;

            case 3:
                System.out.println("k == 3");
            break;

            case 4:
                System.out.println("k == 4");
            break;

            case 5:
                System.out.println("Outer switch k == 5");
                switch (k){
                    case 5:
                        System.out.println("Inner switch k == 5");
                    break;
                }
            break;
        }
    }
}
