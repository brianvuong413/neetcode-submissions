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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0;
        int place = 1;
        while (l1 != null) {
            sum += l1.val * place;
            place *= 10;
            l1 = l1.next;
        }
        place = 1;
        while (l2 != null) {
            sum += l2.val * place;
            place *= 10;
            l2 = l2.next;
        }
        ListNode res = new ListNode(0);
        ListNode temp = res;
        while (sum > 0) {
            temp.next = new ListNode(sum % 10);
            temp = temp.next;
            sum /= 10;
        }
        return res.next;
    }
}
