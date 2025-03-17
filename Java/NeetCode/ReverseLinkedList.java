package Java.NeetCode;

import org.junit.Test;

public class ReverseLinkedList {
    @Test
    public void testReverse() {
        ListNode list = new ListNode(10);
        list.next = new ListNode(5);
        list.next.next = new ListNode(1);
        list.next.next.next = new ListNode(12);
        list.next.next.next.next = new ListNode(13);
        printList(list);
        ListNode ln = ReverseLinkedList.reverse(list);
        System.out.println("reversed");

        printList(ln);
    }


    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode temp;

        while(curr != null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }


    public static void printList(ListNode head) {
        System.out.println(head.val);

        if(head.next == null) {
            return;
        }

        printList(head.next);
    }
}
