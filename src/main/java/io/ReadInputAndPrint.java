package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadInputAndPrint {
    public static void main(String args[]) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(reader);

        HashMap<String,String> map = new HashMap<>();

        while(true) {
            String input = bf.readLine();
            if(input.equals("quit"))
                break;
            else
                System.out.println("your input here" + input);
        }
    }
}
