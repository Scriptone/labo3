package logica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetSum {

    /*
     * Gegeven een getal M en een lijst van positieve getallen. Schrijf een
     * programma waarbij je aanduidt welke getallen uit die lijst exact sommeren tot
     * dat ene getal M. Elk getal mag maximaal 1 keer gebruikt worden in de som. Er
     * kunnen meerdere oplossingen zijn maar het is ok als je programma 1 oplossing
     * weergeeft. Het kan ook zijn dat er geen oplossing is.
     */

    /*
     * M = 15, getallen = 4, 5, 3, 8, 2, 9
     * 
     * -> M = 5 + 8 + 2 maar ook M = 4 + 3 + 8
     * 
     * M = 11, getallen = 12, 10, 2, 7, 4
     * 
     * -> M = 7 + 4
     * 
     * M = 9, getallen = 15, 12, 3, 8, 7
     * 
     * -> geen oplossing
     * 
     * M = 12, getallen = 15, 12, 3, 7, 7
     */

    //elk getal mag maar 1 keer voorkomen, gebruik recursieve functie die een bool returned
    public static boolean subsetSum(int[] getallen, int M, int som, int index, int[] oplossing) {
        //traceInfo
        System.out.println("M: " + M + " som: " + som + " index: " + index);
        if (som == M) {
            for (int i = 0; i < oplossing.length; i++) {
                if (oplossing[i] != 0) {
                    System.out.print(oplossing[i] + " ");
                }
            }
            return true;
        } else if (index == getallen.length) {
            return false;
        } else {
            oplossing[index] = getallen[index];
            if (subsetSum(getallen, M, som + getallen[index], index + 1, oplossing)) {
                return true;
            } else {
                oplossing[index] = 0;
                return subsetSum(getallen, M, som, index + 1, oplossing);
            }
        }
    }


}