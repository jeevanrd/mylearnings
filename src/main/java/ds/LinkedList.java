package ds;

import com.sun.deploy.util.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class LNode {
    public LNode next = null;
    public int data;

    public LNode() {}

    public LNode(int data) {
        this.data = data;
    }

    public void addNodeToEnd(int data) {
        LNode newNode = new LNode(data);
        LNode n = this;

        while(n.next != null) {
            n = n.next;
        }
        n.next = newNode;
    }

    public LNode insertNodeInMiddle(int data, int after) {
        LNode newNode = new LNode(data);
        LNode n = this;

        while(n.next != null) {
            if(n.next.data == after) {
                newNode.next = n.next;
                n.next = newNode;
                break;
            }
            n = n.next;
        }
        return this;
    }

    public LNode deleteNode(int data) {
        LNode n = this;
        while(n.next != null) {
            if(n.next.data == data) {
                n.next = n.next.next;
                break;
            }
            n = n.next;
        }
        return this;
    }

    public void printNodes() {
        List<String> nodes = new ArrayList<String>();
        LNode n = this;

        while(n.next != null) {
            n = n.next;
            nodes.add(Integer.toString(n.data));
        }

        System.out.println(StringUtils.join(nodes, "->"));
    }

}

public class LinkedList {
    public static void  main(String args[]) {
        LNode root = new LNode();
        System.out.println("erer");
        root.addNodeToEnd(1);
        System.out.println("erer");
        root.addNodeToEnd(2);
        root.addNodeToEnd(4);
        root.addNodeToEnd(5);
        root.addNodeToEnd(10);
        root.addNodeToEnd(17);
        System.out.println("erer");
        root.printNodes();

        root = root.insertNodeInMiddle(3, 4);
        root.printNodes();
        root = root.insertNodeInMiddle(8, 10);
        root.printNodes();


        root = root.deleteNode(5);
        root = root.deleteNode(10);

        root.printNodes();
        root = root.insertNodeInMiddle(8, 17);
        root = root.insertNodeInMiddle(8, 17);
        root = root.insertNodeInMiddle(8, 17);

        root.printNodes();
    }
}

