package ds;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stack {

    public Node top;

    public class Node {
        private int num;
        private Node next;

        public Node(int num) {
            this.num = num;
        }
    }

    public void push(int item) {
        Node newNode = new Node(item);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if(top == null)
            return -1;

        Node current = top;
        top = current.next;
        return current.num;
    }


    public void display() {
        List<Integer> nums = new ArrayList<>();
        Node current = top;

        while(current != null) {
            nums.add(current.num);
            current = current.next;
        }

        System.out.println(nums);
    }

    public static void main(String args[]) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.display();
        System.out.println(stack.pop());
        stack.display();
        System.out.println(stack.pop());
        stack.display();
        stack.push(7);
        stack.display();
    }
}
