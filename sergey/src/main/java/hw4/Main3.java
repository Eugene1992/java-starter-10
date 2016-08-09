package hw4;
/*  В три переменные a, b и c записаны три вещественных числа. Создать программу, которая
    будет находить и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0,
            либо сообщать, что корней нет.*/
public class Main3 {
    public static void main(String[] args) {

        getQudrNumber(4, 12, 14);
    }


    static void getQudrNumber(int a, int b, int c){
        int d;
        double result1 = 0;
        double result2 = 0;
        d = b * b - 4 * a * c;
        if (d > 0) {
            result1 = (-b + Math.sqrt(d)) / (2 * a);
            result2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println(result1 + "," + result2);
        }
        if (d < 0) {
            System.out.print("Данное квадратное уравнение не имеет корней.");

        }
    }
}