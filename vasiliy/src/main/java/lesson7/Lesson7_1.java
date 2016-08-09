package lesson7;

/**
 * Methods
 */
public class Lesson7_1 {
    public static void main(String[] args) {
        System.out.println(getRandom());
    }

    static int getRandom() {
        int rand = 0;
        int o = 0;
        int r = 0;
        int counterMore10 = 0;
        int counterLess10 = 0;

        for (int i = 0; i < 100; i++) {

            for (int j = 0; j < 100; j++) {
                rand = (int) (Math.random() * 2);
                if (rand == 1) {
                    o++;
                } else if (rand == 0) {
                    r++;
                }
            }
            if (o - r > 10 || r - o > 10) {
                counterMore10++;
            } else {
                counterLess10++;
            }
        }
        return counterLess10;
    }
}
