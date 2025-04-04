package Java.NeetCode;

import java.util.HashMap;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class CopyLinkedListWithRandomPointer {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> map = new HashMap<>();
        Node result = new Node(0);
        Node t = result;

        Node th = head;

        while(th != null) {
            t.next = new Node(th.val);
            map.put(th, t.next);

            th = th.next;
            t = t.next;
        }
        th = head;
        t = result.next;
        while(th != null) {
            System.out.println("curr"+ t.val);
            if(th.random!= null) {
                Node hmn = map.get(th.random);
                System.out.println("Hmn node"+hmn.val);

                t.random = hmn;
            } else {
                System.out.println("NULL");
                t.random = null;
            }
            t = t.next;
            th = th.next;
        }
        return result.next;
        // System.out.println("----------------");
        // for(Node n: map.keySet()){
        //     int key = n.val;
        //     int val = map.get(n).val;
        //     System.out.println(key+" -> "+val);
        //     System.out.println("0000000000000");
        //     if(n.random!= null)
        //         System.out.println(key +"-> "+n.random.val);
        // }
        // System.out.println(map);

    }
}
