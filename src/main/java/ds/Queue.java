package ds;

import java.util.ArrayList;
import java.util.List;

public class Queue {
    public Node top;

    public class Node {
        private int num;
        private Node next;
        private int min;

        public Node(int num) {
            this.num = num;
        }

        public void setMin(int min){
            this.min = min;
        }
    }

    public void enqueue(int item) {
        Node newNode = new Node(item);
        if(top == null) {
            newNode.setMin(newNode.num);
            top = newNode;
        } else {
            Node current = top;
            while(current.next != null)
                current = current.next;

            int min = (current.min <= item ? current.min : item);
            newNode.setMin(min);
            current.next = newNode;
        }


    }

    public int dequeue() {
        if(top == null)
            return -1;

        Node first = top;
        top = first.next;

        return first.num;

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
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(3);
        queue.enqueue(5);
        queue.display();
        System.out.println(queue.dequeue());
        queue.display();
        System.out.println(queue.dequeue());
        queue.display();
        queue.enqueue(7);
        queue.display();
    }

}
