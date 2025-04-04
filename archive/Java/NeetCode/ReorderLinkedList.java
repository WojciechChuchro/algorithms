package Java.NeetCode;


import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertTrue;

public class ReorderLinkedList {
    @Test
    public void testReverse() {
        ListNode ln = new ListNode(2);
        ln.next = new ListNode(4);
        ln.next.next = new ListNode(6);
        ln.next.next.next = new ListNode(8);

        ReorderLinkedList.reorderList(ln);

        assertTrue("", ln.val == 2);
        assertTrue("", ln.next.val == 8);
        assertTrue("", ln.next.next.val == 4);
        assertTrue("", ln.next.next.next.val == 6);
    }
    public void reorderList2(ListNode head) {
        ListNode slow = head, fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode rightSide = null;
        ListNode temp = slow.next;
        slow.next = null;

        while(temp != null) {
            ListNode t = temp.next;

            temp.next = rightSide;
            rightSide = temp;
            temp = t;
        }

        ListNode newHead = head;
        while(rightSide != null) {
            ListNode e = newHead.next;
            ListNode d = rightSide.next;

            newHead.next = rightSide;
            rightSide.next = e;
            newHead = e;
            rightSide = d;
        }

    }
    public static void reorderList(ListNode head) {
        List<Integer> list = new ArrayList<>();

        ListNode temp = head;

        while(temp!=null) {
            list.add(temp.val);
            temp = temp.next;
        }

        int l = 0, r = list.size() - 1;
        ListNode traverse = head;

        while (l <= r) {
            traverse.val = list.get(l);
            l++;

            if(l <= r) {
                traverse = traverse.next;
                traverse.val = list.get(r);
                r--;
            }

            traverse = traverse.next;
        }
}
    }
