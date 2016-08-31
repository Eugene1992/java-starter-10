package cw09;

public class StringExample {
    public static void main(String[] args) {
        char c = 'c';
        String s = "Hello";
        String s2 = "Hello";
        String s3 = "Alabama";

        int strLength = s.length();
        System.out.println(strLength);

        String subStr = s.substring(1, 3);
        System.out.println(subStr);

        System.out.println(s.indexOf('o'));

        System.out.println(s.equals(s2));
        System.out.println(s.equalsIgnoreCase(s2));
        System.out.println(s.compareTo(s2));

        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

        s = s + (char)99;
        String sum = "";

        sum = sum + 'H';
        sum = sum + 'e';
        sum = sum + 'l';
        sum = sum + 'l';
        sum = sum + 'o';

        System.out.println(sum);

        int rand = (int)(Math.random()*5 + 3); // вещественное число из [3;8)
    }
}
