package ds;

import java.util.Arrays;
import java.util.Collections;

public class BinarySearch {

    public static void main(String args[]) {
        String s = "qwew";
        System.out.println(s.indexOf("r"));
        int[] arr = new int[] {1,3,4,5,6,10,12,14,21};
        int result = Search(arr, 0, arr.length - 1, 21);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "+result);

    }

    public static int Search(int[] arr, int start, int end, int elem) {
        System.out.println(start + "-" + end);

        int num;

        if(start > end)
            return -1;

        int mid = (start + end)/2;

        if(arr[mid] == elem)
            return elem;

        if(elem > arr[mid]) {
            return Search(arr, mid + 1, end, elem);
        } else {
            return Search(arr, start, mid - 1, elem);
        }
    }
}
