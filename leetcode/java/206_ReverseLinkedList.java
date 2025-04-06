class Solution {
    public ListNode reverseList(ListNode head) {
      if(head == null) {
        return head;
      }
      
      ListNode l = null;
      ListNode r = head;

      while(r != null) {
        ListNode temp = r.next;
        r.next = l;
        l = r;
        r = temp;
      }

      return l;
    }
}