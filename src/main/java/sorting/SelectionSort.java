package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String args[]) {
        int[] numbers = new int[] { 23,4,20,3,30, 6, 34, 11, 1};
        int len  = numbers.length;

        for(int i = 0; i< len ; i++) {
            int min_pos = i;

            for(int j = i+1; j < len; j ++) {
                if (numbers[j] < numbers[min_pos])
                    min_pos = j;
            }

            if(min_pos != i) {
                int temp = numbers[i];
                numbers[i] = numbers[min_pos];
                numbers[min_pos] = temp;
            }
        }


        System.out.println(Arrays.toString(numbers));
    }
}
