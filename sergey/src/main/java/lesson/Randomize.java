package lesson;

public class Randomize {
    public static void main(String args[]) {
        /*getRandom();*/
        System.out.println("    " + getPassword(1));
        System.out.println("   " +getPassword(3));
        System.out.println("  " +getPassword(5));
        System.out.println(" " +getPassword(7));
        System.out.println(getPassword(9));
    }

    static String getPassword(int length) {
        String pass = "";
        for (int i = 0; i < length; ) {
            int key = (int) (Math.random() * 74 + 48);
            if (key > 57 && key < 65 || key > 90 && key < 97) {
                continue;
            }
            char letter = (char) key;
            pass += letter;
            ++i;
        }
        return pass;
    }

}

