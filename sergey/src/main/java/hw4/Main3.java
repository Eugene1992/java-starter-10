package hw4;
/*  В три переменные a, b и c записаны три вещественных числа. Создать программу, которая
    будет находить и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0,
            либо сообщать, что корней нет.*/
public class Main3 {
    public static void main(String[] args) {
        int a = 12;
        int b = 10;
        int c = 13;
        int D;
        double result1 = 0;
        double result2 = 0;
        D = b * b - 4 * a * c;
        if(D > 0) {
            result1 = ( -b + Math.sqrt(D) ) / ( 2 * a );
            result2 = ( -b + Math.sqrt(D) ) / ( 2 * a );
            System.out.println(result1 + "," + result2);
        }
   if(D < 0){
       System.out.print("Данное квадратное уравнение не имеет корней.");

   }
    }
}
