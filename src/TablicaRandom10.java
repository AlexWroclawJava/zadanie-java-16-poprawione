import java.util.Arrays;
import java.util.Random;

public class TablicaRandom10 {
    public static void main(String[] args) {
        System.out.println();

        Random rand = new Random();

        int[] tablica = new int[10];
        int l = tablica.length;

        for (int i = 0; i < l; i++) {
           tablica[i] = rand.nextInt(100);
        }

        for (int i = l; i > 0; i--) {
            System.out.print(tablica[l-i] + " ");
            System.out.print(tablica[i-1] + " ");
        }
    }
}
