package lesson;

public class Randomize {
    public static void main(String args[]) {
        /*getRandom();*/
        get13From999999();
    }

    static int get13From999999() {
        int full = 0;
        int full1 = 0;
        int full2 = 0;
        int full3 = 0;
        int full4 = 0;
        int full5 = 0;
        int full6 = 0;
        int count = 0;
        int over = 0;
        for (int i = 0; i < 999999; ) {
            full++;
            full1 = full / 100000 % 10;
            full2 = full / 10000 % 10;
            full3 = full / 1000 % 10;
            full4 = full / 100 % 10;
            full5 = full / 10 % 10;
            full6 = full % 10;
            if (full1 == 1) {
                if (full2 == 3) {
                    ++over;
                }
            }
            if (full2 == 1) {
                if (full3 == 3) {
                    ++over;
                }
            }
            if (full3 == 1) {
                if (full4 == 3) {
                    ++over;
                }
                if (full3 == 1) {
                    if (full4 == 3) {
                        ++over;
                    }
                    if (full4 == 1) {
                        if (full5 == 3) {
                            ++over;
                        }
                    }
                    if (full5 == 1) {
                        if (full6 == 3) {
                            ++over;
                        }
                    }

                    System.out.print(over);
                }
            }
        }
        return over;
    }

}



    /*static double getRandom(){

        double eagleside = 0;
        double reshkaside = 0;
        double proc = 0;
        int over = 0;
        for(int i = 0; i < 100; i++){
            eagleside = 0;
            reshkaside = 0;
            for (int j = 0; j < 100; j++) {
                int random = (int) (Math.random() * 2);
                if (random == 0) {
                    eagleside++;
                }
                if (random == 1) {
                    reshkaside++;
                }
            }
            if(reshkaside - eagleside > 10){
                ++over;
            }
            if(eagleside - reshkaside > 10){
                ++over;
            }
        }
        System.out.println("Отклонениеот нормы " + over + " раз");
        System.out.println(reshkaside + " Выпала решка");
        System.out.println(eagleside + " Выпал орел");
        return proc;
    }*/

