package hw4;

import java.util.Scanner;

public class doska {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите размерность доски: ");
            int ver = sc.nextInt();
            int gor = sc.nextInt();
        int ver1 = 0;
        int gor1 = 0;
        for(int i = 0;i < gor ;i++){
                for(int j=0;j<ver ;j++)
                    if((i+j)%2==0){
                        if(ver1 < 5) {
                            ver++;
                            System.out.print("Ж Ж Ж Ж Ж ");
                        }else{
                             if(gor1 < 5){
                                gor1++;
                                System.out.print("- - - - - ");
                            }
                        }
            }
            }

        }

    }


