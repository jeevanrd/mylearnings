///**
// * Created by jeevan on 27/07/16.
// */
//public class Palindrome {
//    public static void main(String args[]) {
//        System.out.println(longestPalindromeDP("assabababc"));
//
//    }
//
//    public static String longestPalindromeDP(String str) {
//        char[] s = str.toCharArray();
//
//        int n = str.length();
//        int longestBegin = 0;
//        int maxLen = 1;
//
//        boolean[][] table = new boolean[1000][1000];
//        for (int i = 0; i < n; i++) {
//            table[i][i] = true;
//        }
//
//        for (int i = 0; i < n-1; i++) {
//            if (s[i] == s[i+1]) {
//                table[i][i+1] = true;
//                longestBegin = i;
//                maxLen = 2;
//            }
//        }
//
//        for (int len = 3; len <= n; len++) {
//            for (int i = 0; i < n-len+1; i++) {
//                int j = i+len-1;
//                if (s[i] == s[j] && table[i+1][j-1]) {
//                    table[i][j] = true;
//                    longestBegin = i;
//                    maxLen = len;
//                }
//        }
//        return str.substring(longestBegin, longestBegin + maxLen);
//    }
////}
