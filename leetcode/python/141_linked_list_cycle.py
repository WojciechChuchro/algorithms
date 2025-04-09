from typing import Optional

class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        if not head:
            return False

        s = head
        f = head

        while f:
            if not f or not f.next or not f.next.next:
                return False
            s = s.next
            f = f.next.next
                
            if s == f:
                return True
        
        return False

        
