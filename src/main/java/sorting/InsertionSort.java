package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertionSort {
    public static void main(String args[]) {
        int[] numbers = new int[] { 2, 4, 5, 6, 6, 3, 1, 26, 11, 30, 2};
//        int[] numbers = new int[] { 2, 4, 30, 26, 6, 11};
//        int[] numbers = new int[] { 2, 30, 6, 11};
        int len = numbers.length;


        for(int i=1; i<len; i++) {
            int pos = i;
            for(int j=0; j < i; j++) {
                if(numbers[pos] < numbers[j]) {
                    pos = j;
                    break;
                }
            }

            if(pos != i) {
                int min = numbers[i];
                for(int z=i;z>pos;z--)
                    numbers[z] = numbers[z-1];
                numbers[pos] = min;
            }
        }

        System.out.println(Arrays.toString(numbers));

    }
}


