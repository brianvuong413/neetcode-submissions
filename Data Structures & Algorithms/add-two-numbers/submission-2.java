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
        int carryOver = 0;
        
        ListNode head = new ListNode(0);
        ListNode temp = head;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + carryOver;
            if (sum > 9) {
                carryOver = sum / 10;
                sum %= 10;
            } else carryOver = 0;

            temp.next = new ListNode(sum);
            System.out.println(temp.val);
            temp = temp.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 == null && l2 != null) {
            temp = l2;
            l2.val += carryOver;
            if (l2.val + carryOver > 9) {
                l2.val %= 10;
                carryOver /= 10;
            } else carryOver = 0;
            temp = temp.next;
            l2 = l2.next;
        } 
        while (l2 == null && l1 != null) {
            temp = l1;
            l1.val += carryOver;
            if (l1.val + carryOver > 9) {
                l1.val %= 10;
                carryOver /= 10;
            } else carryOver = 0;
            temp = temp.next;
            l1 = l1.next;
        } 
        System.out.println(carryOver);
        if (carryOver != 0)
            temp.next = new ListNode(carryOver);
        return head.next;
    }
}
