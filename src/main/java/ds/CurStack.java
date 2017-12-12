package ds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import java.util.ArrayList;
import java.util.List;


public class CurStack {
    private ArrayList<Integer> items = new ArrayList<Integer>();

    public CurStack() {}

    public Integer push(int val) {
        this.items.add(0, val);
        return val;
    }

    public Integer pop() {
        if(this.items.size() == 0)
            return -999999;
        this.items.get(0);
        return this.items.remove(0);
    }

    public void inc(int pos, int val) {
        int len = this.items.size();
        int start = len - pos;

        for(int i = start; i < len; i++){
            this.items.set(i, this.items.get(i) + val);
            System.out.println(this.items.get(i));
        }
    }

    public static void main(String args[]) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(reader);
        CurStack curStack = new CurStack();

        while(true) {
            String input = bf.readLine();
            if(input == null || input.equals(""))
                break;

            String[] arr = input.split(" ");
            if(arr[0].equals("push"))
                System.out.println(curStack.push(Integer.parseInt(arr[1])));
            else if (arr[0].equals("pop"))
                System.out.println(curStack.pop());
            else if (arr[0].equals("inc"))
                curStack.inc(Integer.parseInt(arr[1]), Integer.parseInt(arr[2]));
        }

    }
}
