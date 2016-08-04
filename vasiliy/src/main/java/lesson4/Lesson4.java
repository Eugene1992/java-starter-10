package lesson4;

import com.sun.org.apache.xpath.internal.SourceTree;

import javax.xml.bind.SchemaOutputResolver;

/**
 * Created by Advantis on 04.08.2016.
 */
public class Lesson4 {
    public static void main(String[] args) {
        /*int a =5;
        int b = 15;
        System.out.println("Start");
        if (a>b){
            System.out.println("a>b");*/

        /*int a=3;
        if ((a%2)==0){
            System.out.println("pair number = " +a);
        }else{
            System.out.println("odd number = " +a);
        }*/

        int c=43;
        int c1 = 43/16;
        System.out.print(+c1);
        int c2 = 43%16;
        switch (c2){
            case 11:
                System.out.print("B");
                break;
            case 12:
                System.out.print("C");
                break;
            case 13:
                System.out.print("D");
                break;
            case 14:
                System.out.print("E");
                break;
        }

    }
}
