package lesson8416;
public class lesson {
    public static void main(String[] args) {
        int number = 25;
        int a = number % 2;
        if((number - a) == number){
            System.out.println("Ваше число четное");
        } else{
            System.out.println("Ваше число нечетное");
        }
        if(number == 0){
            System.out.println("Ноль не относится к четным и нечетным");
        }
        }
    }
