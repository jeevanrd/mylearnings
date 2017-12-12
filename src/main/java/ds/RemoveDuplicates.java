package ds;


import java.util.*;

public class RemoveDuplicates {
    public static int a[] = new int[] {1,2,3,4,5,2,6,7,3,8};
    public static void main(String args[]) {

//        System.out.println(Arrays.toString(map.keySet().toArray()));
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < a.length; i++) {
            map.put(a[i], a[i]);
        }

        List<Integer> list  = Arrays.asList(1,2,3,4,5,2,6,7,3,8);

        System.out.println();
    }
}
