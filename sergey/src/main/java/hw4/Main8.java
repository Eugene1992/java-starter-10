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
               case 1:
                   System.out.print("" + n);
                   break;
                    case 5:
                   System.out.print("" + n);
                   break;
                    case 2:
                   System.out.print("" + n);
                   break;
                    case 3:
                   System.out.print("" + n);
                   break;
                     case 4:
                   System.out.print("" + n);
                   break;



           }
            c = c / 16;

        }
        System.out.println(res);
    }
}