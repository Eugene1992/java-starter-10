package lesson5;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Advantis on 05.08.2016.
 */
public class Lesson5 {
    public static void main(String[] args) {
        int a =12321;
        String res = "";
        while ( a>0){
            res = a % 2 + res;
            a = a / 2;


        }
        System.out.println(""+res );
    }
}
