# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def mergeTwoLists(self, l1: ListNode, l2: ListNode) -> ListNode:
        newList = ListNode(0)
        root = newList
        while l1 is not None and l2 is not None:
            if l1.val <= l2.val:
                root.next = ListNode(l1.val)
                l1 = l1.next
            else:
                root.next = ListNode(l2.val)
                l2 = l2.next
            root = root.next 
        root.next = l1 if l1 is not None else l2
            
        return newList.next
