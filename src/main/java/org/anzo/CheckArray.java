package org.anzo;


public class CheckArray {
    public static final int SUM = 12;

    public static boolean result(int[] ar1) {


        for (int i = 0; i < ar1.length - 1; i++) {

            for (int j = ar1.length - 1; j > 0; j--) {

                if (ar1[i] + ar1[j] == SUM) {
                    return true;
                }

            }

        }
        return false;
    }
}