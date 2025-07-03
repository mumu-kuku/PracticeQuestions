package 递归;

class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode NewHead = head.next;
        head.next = swapPairs(NewHead.next);
        NewHead.next = head;
        return NewHead;
    }
}
