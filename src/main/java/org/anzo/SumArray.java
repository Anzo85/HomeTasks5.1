package org.anzo;



import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class SumArray {


    public static void summary(int[] array1, int[] array2) {

        int[] sumArray = ArrayUtils.addAll(array1, array2);
        Arrays.sort(sumArray);

        for (int i = 0; i < sumArray.length; i++) {
            System.out.println(sumArray[i]);
        }

    }
}
