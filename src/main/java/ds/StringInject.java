package ds;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringInject {

    public static ArrayList<Integer> getIntegerArr(String input) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < input.length(); i++) {
            arr.add(Integer.valueOf(input.charAt(i)));
        }
        return arr;
    }

    public static Boolean compareArr(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        for(int i=0;i< arr1.size(); i++) {
            if(arr2.get(i) < arr1.get(i))
                return false;
        }
        return true;
    }


    public static void main(String args[]) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(reader);

        int[] a  = new int[] {1,2,3};

        int[] b = Arrays.copyOfRange(a, 0, 0);
        System.out.println(Arrays.toString(b));

        String input1 = bf.readLine();
        String input2 = bf.readLine();




        if(input1.equals("") || input2.equals("")) {
            System.out.println("Please enter valid values for both fields");
            return;
        }

        ArrayList<Integer> inputArr1 = getIntegerArr(input1);
        ArrayList<Integer> inputArr2 = getIntegerArr(input2);

        Collections.sort(inputArr1);
        Collections.sort(inputArr2);

        System.out.println(compareArr(inputArr1, inputArr2));
    }
}
