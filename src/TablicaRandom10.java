import java.util.Arrays;
import java.util.Random;

public class TablicaRandom10 {
    public static void main(String[] args) {
        System.out.println();

        Random rand = new Random();

        int[] tablica = new int[5];
        int length = tablica.length;

        for (int i = 0; i < length; i++) {
            tablica[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(tablica));

            String reversed = "";
            for (int i = 0; i < length; i++) {
                System.out.print(tablica[i] + " ");
                if (reversed.isEmpty()){
                    reversed = "" + tablica[length-1-i];
                } else {
                reversed = reversed + " " + tablica[length-1-i];
                }
            }
            System.out.println(reversed);
        }
    }


