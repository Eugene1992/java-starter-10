package lesson4;

/**
 * Created by Advantis on 04.08.2016.
 */
public class HomeWork4_Task6 {
    public static void main(String[] args) {
        System.out.println("This program calculate quadratic formula.");
        // Read values a,b,c from the user
        double a = 7;
        double b = 8;
        double c = 1;
        // D is the discriminant. Program calculates D and prints for user amount of possible roots
        // x1 and x2 are possible roots of quadratic equation
        double D = (b * b - 4 * a * c);
        double x1 = ((-b) + Math.sqrt(D)) / 2 * a;
        double x2 = ((-b) - Math.sqrt(D)) / 2 * a;
        // There are printing of quadratic formula roots. Was mentioned that value a cannot be 0.
        if (D > 0 && a != 0) {
            System.out.println("One root is " + x1 + "");
            System.out.println("The other is " + x2 + "");
        } else if (D == 0 && a != 0) {
            System.out.println("There is one root " + x1 + "");
        } else if (D < 0 && a != 0) {
            System.out.println("There are no real roots.");
        } else if (a == 0) {
            System.out.println("Value a cannot be 0");
        }
    }
}
