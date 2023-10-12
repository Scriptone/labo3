package logica;

/**
 * AUTHOR: Arne Haers
 * DATE: 12/10/2023
 * PROJECT: labo3
 **/
public class Main {
    public static void main(String[] args) {
        int[] getallen = { 4, 5, 3, 8, 2, 9 };
        SubsetSum.subsetSum(getallen, 15, 0, 0, new int[getallen.length]);
    }
}