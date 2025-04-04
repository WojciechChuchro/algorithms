from typing import Optional

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def hasCycleHashSet(head: Optional[ListNode]) -> bool:
    exists = {}
    current = head
    while current:
        current = current.next
        if current in exists:
            return True
        exists[current] = current
    return False
def hasCycle(head: Optional[ListNode]) -> bool:
    slow, fast = head, head
    while fast and fast.next:
        slow = slow.next
        fast = fast.next.next
        if slow == fast:
            return True
    return False

ll = ListNode(1)
ll.next = ListNode(2)
ll.next.next = ListNode(3)
ll.next.next.next = ListNode(4)
print(hasCycle(ll))
