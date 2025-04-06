import java.util.*;

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
      List<Integer> l = new ArrayList<>();

      ListNode t = head;
      while(t != null) {
        if(!l.contains(t.val)){
          l.add(t.val);
        }
        t = t.next;
      }
      ListNode r = new ListNode(-1);
      t = r;
      while(l.size() > 0) {
        ListNode newNode = new ListNode(l.remove(0));

        t.next =  newNode;
        t = t.next;
      }


return r.next;
    }
}