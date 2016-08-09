package hw4;

import com.sun.security.auth.SolarisNumericUserPrincipal;

public class Main7 {
    public static void main(String[] args) {
        int i = 1000;
        int i1 = 1;
        int c = 0;
        int c1 = 90;
        int c2 = 20;
        int i3 = 2;
        int b = 0;
        int a = 1;
        int n;

    /*for(;i <9996;){
        i++;
        i++;
        ++i;
        System.out.print(i + " ");
    }

    do {
        System.out.print(i1 + " ");
        i1 = i1 + 2;
        c++;
    } while(c < 55);

    while(c1 > 0){
        c1 = c1 - 5;
        System.out.print(c1 + " ");
    }
*/
    /*do{
        System.out.print(i3 + " ");
        i3 = i3 * 2;
        c2++;
    } while(c2 < 55);
    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        for(int i4 = 0; i4 < 10;){
            i4++;
            n = a + b;
            a = b;
            b = n;
            System.out.print(n + " ");
        }
        //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!*/

    }
    static void sequenceOfRange(int i) {
        for(i < 9996;){
            i++;
            i++;
            ++i;
            System.out.print(i + " ");
        }
        }


    static void secondOfRange(){
        int c1 = 90;
        int i1 = 1;
        int c = 0;
        do {
            System.out.print(i1 + " ");
            i1 = i1 + 2;
            c++;
        } while(c < 55);

        while(c1 > 0){
            c1 = c1 - 5;
            System.out.print(c1 + " ");
        }

    }
    static void thirdOfRange() {
        int i3 = 2;
        int c2 = 20;
        do{
            System.out.print(i3 + " ");
            i3 = i3 * 2;
            c2++;
        } while(c2 < 55);

    }
    static void Fiabachi() {
        int n;
        for(int i4 = 0; i4 < 10;){
            i4++;
            int b = 0;
            int a = 1;
            n = a + b;
            a = b;
            b = n;
            System.out.print(n + " ");
        }
    }
}

