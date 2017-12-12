package problems;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lcs {
    public static void main(String args[]) {
        System.out.println(Match("aaabbacb", "daaabbcss", 8, 9));
    }

    public static String Match(String input1, String input2, int m, int n) {
        if (m == 0 || n == 0)
            return "";
        if (input1.charAt(m-1) == input2.charAt(n-1))
            return  Match(input1, input2, m - 1, n - 1) + input1.charAt(m-1);
        else
            return max(Match(input1, input2, m, n - 1), Match(input1, input2, m - 1, n));
    }

    public static String max(String i1, String i2) {
        return i1.length() > i2.length() ? i1 : i2;
    }

    public static String Match2(char[] arr1, char[] arr2, int len1, int len2) {

        int j = 0, next_start = 0 ;
        List<Character> match = new ArrayList<>();

        for(int i=0; i < len1; i++) {
            while(j < len2 && arr2[j] != arr1[i])
                j++;

            if (j < len2) {
                next_start = j+1;
                match.add(arr1[i]);
            } else {
                j = next_start;
            }
        }

        return match.toString();

    }
}
