package lesson8_9;

/**
 * 3. Вывести первую и вторую половину одномерного массива
 */
public class HomeWork3 {
    public static void main(String[] args) {
        int[] array = new int[4];
        array[0]= 2;
        array[1]= 4;
        array[2]= 5;
        array[3]= 3;
        getHalf(array);
    }
    static void getHalf( int[] array){
        for(int i = 0; i < array.length; i++){
            if(i < array.length/2){
                System.out.println("Number of the first part "+array[i]+" ");
            }else if(i>=array.length/2 && i<array.length){
                System.out.println("Number of the second part "+array[i]+" ");
            }
        }

    }
}

