package Java.NeetCode;

public class RemoveNodeFromEndOfLinkedList {
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

        void printNode(ListNode l) {
            ListNode traverse = l;

            System.out.print("HEAD ");
            while(traverse != null) {
                System.out.print(traverse.val + " -> ");
                traverse = traverse.next;
            }
            System.out.print(" TAIL");
            System.out.println("\n--------------");
        }

        ListNode reverseListNode(ListNode head) {


            ListNode l = null;
            ListNode r = head;

            while(r!= null) {
                ListNode temp = r.next;

                r.next = l;
                l = r;
                r =  temp;
            }

            return l;
        }
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode l = new ListNode();
            ListNode temp = null;
            l.next = head;
            temp = l;

            ListNode r = head;
            for (int i = 0; i < n; i++) {
                r = r.next;
            }
            printNode(temp);
            printNode(r);
            while(r!= null) {
                temp = temp.next;
                r = r.next;
            }
            printNode(temp);
            printNode(r);
            temp.next = temp.next.next;

            printNode(l);
            return l.next;
        }
}
