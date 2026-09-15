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
    public boolean hasCycle(ListNode head) {


        if(head == null || head.next == null) return false;


        ListNode past = head;
        ListNode fast = head.next.next;



        while(past != fast){

            if(fast == null || fast.next == null) return false;


            past = past.next;
            fast = fast.next.next;

        }


        return true;



        
    }
}
