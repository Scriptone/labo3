package logica;

/**
 * AUTHOR: Arne Haers
 * DATE: 12/10/2023
 * PROJECT: labo3
 **/
public class Main {
    public static void main(String[] args) {
        int[] getallen = { 3, 7, 21, 21, 41, 18, 9, 22, 32, 8, 17, 24, 34 };
        boolean result = SubsetSum.subsetSum(getallen, 37, 0, 0, new int[getallen.length]);

        if (!result) {
            System.out.println("Geen oplossing gevonden");
        } else {
            System.out.println("Oplossing gevonden");
        }
    }
}