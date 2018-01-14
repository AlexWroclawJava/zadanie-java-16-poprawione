import java.util.Arrays;
import java.util.Random;

public class TablicaRandom10 {
    public static void main(String[] args) {
        System.out.println();

        Random rand = new Random();

        int[] tablica = new int[10];
        int l = tablica.length;

        for (int i = 0; i < tablica.length; i++) {
           tablica[i] = rand.nextInt(100);
        }

        for (int i = 10; i > 0; i--) {
            System.out.print(tablica[10-i] + " ");
            System.out.print(tablica[i-1] + " ");
        }
    }
}
