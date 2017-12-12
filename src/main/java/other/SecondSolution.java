package other;

// Read only region start
class SecondSolution {
    public static void main(String args[]) {
        String input1 = "My name is Fran";
        String input2 = "rim";
        System.out.println(find(input1, input2));
    }

    public static String find(String s, String p) {
        if (p.length() > s.length())
            return null;
        int[] pCount = new int[256];
        int[] sCount = new int[256];

        for(int i=0;i<p.length();i++) {
            pCount[(int)(p.charAt(i))]++;
            sCount[(int)(s.charAt(i))]++;
        }

        int i = 0, j = p.length(), min = Integer.MAX_VALUE;
        String res = null;

        while (j < s.length()) {
            Boolean state = containsPatternChar(sCount, pCount);

            if (state) {
                if ((j - i) < min) {
                    min = j - i;
                    res = s.substring(i, j);

                    if(min==p.length())
                        break;

                    // Reduce the window size.
                    sCount[(int)(s.charAt(i))]--;
                    i++;
                }
            } else {
                sCount[(int)(s.charAt(j))]++;
                // Increase the window size.
                j++;
            }
        }

        System.out.println(res);
        return res;
    }


    private static boolean containsPatternChar(int[] sCount, int[] pCount) {
        for(int i=0;i<256;i++) {
            if(pCount[i] > sCount[i])
                return false;
        }
        return true;
    }

    public static String GetSubString(String input1,String input2){
        if(input1 == null || input2 == null)
            throw new UnsupportedOperationException("Please provide valid input values for input1 && input2");

        if (input2.length() > input1.length())
            return null;

        int[] input1Arr = new int[256];
        int[] input2Arr = new int[256];

        for(int i=0;i<input2.length();i++) {
            input1Arr[(int)(input1.charAt(i))]++;
            input2Arr[(int)(input2.charAt(i))]++;
        }
        int i = 0, j = input2.length(), min = Integer.MAX_VALUE;
        String res = null;

        while (j < input1.length()) {
            if (containsPatternChar(input1Arr, input2Arr)) {
                if ((j - i) < min) {
                    min = j - i;
                    res = input1.substring(i, j);

                    if(min==input2.length())
                        break;

                    input2Arr[(int)(input1.charAt(i))]--;
                    i++;
                }
            } else {
                input2Arr[(int)(input1.charAt(j))]++;
                j++;
            }
        }
        return res;
    }


}