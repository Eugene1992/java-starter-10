package hw4;

public class Main8 {
    public static void main(String[] args) {
        int c = 21;
        int c1 = 1;
        int n = 0;
        int result = 0;
        int d = 0;
        String res = "";
       /* ДВОИЧНАЯ
       while (c > 0) {
            c1 = c % 2;

            res = c1 + res;
            c = c / 2;

        }*/
       /* ВОСЬМИРИЧНАЯ
       while (c > 0) {
            c1 = c % 2;

            res = c1 + res;
            c = c / 2;

        }*/
        //ШЕСТНАДЦАТИРИЧНАЯ
       while (c >= 0) {
            n = c / 16;
            d = c % 16;
           switch(d){
               case 10:
                   System.out.print("A" + n);
                   break;
                    case 11:
                   System.out.print("B" + n);
                   break;
                    case 12:
                   System.out.print("C" + n);
                   break;
                    case 13:
                   System.out.print("D" + n);
                   break;
                     case 14:
                   System.out.print("E" + n);
                   break;
               case 15:
                   System.out.print("F" + n);
                   break;



           }
            c = c / 16;

        }
        System.out.println(res);
    }
}