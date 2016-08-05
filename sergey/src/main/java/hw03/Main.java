package hw03;
public class Main {
    public static void main(String args[]) {
        int c = 123;
        int c1 = 1;
        int result = 0;
        String res = "";
        while(c > 0){
            c1 = c % 2;

            res = c1 + res;
            c = c / 2;
        }
        System.out.println(res);

     /*   int f1 = r1 * 2;
        int f2 = r2 * 2;
        int f3 = r3 * 2;
        int f4 = r4 * 2;
        int f5 = r5 * 2;
        int f6 = r6 * 2;


        int number1 = c - f1;
        int number2 = r1 - f2;
        int number3 = r2 - f3;
        int number4 = r3 - f4;
        int number5 = r4 - f5;
        int number6 = r5 - f6;
        System.out.print( 1 + "" + number6 + "" + number5 + "" +  number4 + "" +  number3 + "" +  number2 + "" +  number1 );
    */}
}
