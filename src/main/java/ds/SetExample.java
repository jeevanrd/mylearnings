package ds;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {

        String Str = "erere";
        int len = Str.length();
        for(int i=0; i<len;i++) {
            System.out.println(Str.substring(i) );
        }

//        Set set1 = new HashSet<>();
//        Set set2 = new LinkedHashSet<>();

//        for(int i=0;i<10;i++) {
//            set1.add(i % 4);
//            set2.add(i % 4);
//        }
//
//
//        System.out.println("set1 size ==== " + set1.size());
//        System.out.println("set2 size ==== " + set2.size());
//
//        System.out.println("set1 eles ==== " + Arrays.asList(set1));
//        System.out.println("set2 eles ==== " + Arrays.asList(set2));
    }
}
