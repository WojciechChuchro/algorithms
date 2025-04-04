package Java.NeetCode;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ReverseLinkedList {
    @Test
    public void testReverse() {
        ListNode list = new ListNode(10);
        list.next = new ListNode(5);
        list.next.next = new ListNode(1);
        list.next.next.next = new ListNode(12);
        list.next.next.next.next = new ListNode(13);

        printList(list);
//        ListNode ln = ReverseLinkedList.reverse(list);
        ListNode ln = ReverseLinkedList.reverseRecursion(list);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        System.out.println("reversed");
        printList(ln);
        System.setOut(originalOut);

        String actualOutput = outputStream.toString().trim();

        String expectedOutput = "reversed\n13 12 1 5 10";

        assertEquals(expectedOutput, actualOutput);

    }

    public static ListNode reverseRecursion(ListNode head) {

        if (head == null) return null;

        ListNode newHead = head;

        if(head.next!= null) {
            newHead =  reverseRecursion(head.next);
            head.next.next = head;
        }
        head.next = null;

        return newHead;
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
        System.out.print(head.val);
        System.out.print(" ");

        if(head.next == null) {
            return;
        }

        printList(head.next);
    }
}
