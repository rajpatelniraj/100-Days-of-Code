/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode first = dummy;
        ListNode second = dummy;

        // Move first pointer to the kth node from the beginning
        for (int i = 0; i < k; i++) {
            first = first.next;
        }

        // Move second pointer k positions ahead of first (kth node from the end)
        ListNode temp = first;
        while (temp != null) {
            temp = temp.next;
            second = second.next;
        }

        // Swap the values of the first and second nodes
        int tempVal = first.val;
        first.val = second.val;
        second.val = tempVal;

        return dummy.next;

    }
}