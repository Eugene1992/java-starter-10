package lesson;
public class Randomize {
    public static void main(String args[]) {
        /*getRandom();*/
    }

    static int get13From999999(){
        int full = 999999;
        int count = 0;
        for (int i = 0; i < 999999; i++) {
        full = full / 100000 % 10;
        full = full / 10000 % 10;
        full = full / 1000 % 10;
        full = full / 100 % 10;
        full = full / 10% 10;
        return count;
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

