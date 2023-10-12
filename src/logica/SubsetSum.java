package logica;

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

//    public static void main(String[] args) {
//        int M = 15;
//        int[] getallen = { 4, 5, 3, 8, 2, 9 };
//        int[] oplossing = new int[getallen.length];
//        int som = 0;
//        int index = 0;
//        boolean opgelost = false;
//
//        while (!opgelost) {
//            if (som + getallen[index] <= M) {
//                som += getallen[index];
//                oplossing[index] = getallen[index];
//                index++;
//            } else {
//                index--;
//                som -= oplossing[index];
//                oplossing[index] = 0;
//                index++;
//            }
//
//            if (som == M) {
//                opgelost = true;
//            }
//        }
//
//        for (int i = 0; i < oplossing.length; i++) {
//            if (oplossing[i] != 0) {
//                System.out.print(oplossing[i] + " ");
//            }
//        }
//    }

    public static void subsetSum(int[] getallen, int M, int index, int som, int[] oplossing) {
        if (som == M) {
            for (int i = 0; i < oplossing.length; i++) {
                if (oplossing[i] != 0) {
                    System.out.print(oplossing[i] + " ");
                }
            }
            System.out.println();
            return;
        }

        if (index == getallen.length) {
            return;
        }

        oplossing[index] = getallen[index];
        subsetSum(getallen, M, index + 1, som + getallen[index], oplossing);
        oplossing[index] = 0;
        subsetSum(getallen, M, index + 1, som, oplossing);
    }
}