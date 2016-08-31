package cw09;

/**
 * Created by deyneko55 on 11.08.16.
 */
public class Password {
    public static void main(String[] args) {
        System.out.println(getRandPassword(5));
    }

    static String getRandPassword(int length){
        String res = "";
        int rand;

        for (int i = 0; i < length;) {
            rand = (int)(Math.random() * 74 + 48);
            if (rand > 57 && rand < 65 || rand > 90 && rand < 97) continue;
            res += (char)rand;
            i++;
        }
        return res;
    }
}
