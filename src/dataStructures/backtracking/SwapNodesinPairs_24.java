package dataStructures.backtracking;

import dataStructures.utilClasses.ListNode;

public class SwapNodesinPairs_24 {
    /**
     * This method returns a ListNode, in which every 2 adjacent nodes are swapped
     * @param head the input ListNode
     * @return a ListNode, in which every 2 adjacent nodes are swapped compared to input ListNode
     */
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        //slow and fast are the adjacent 2 nodes for swapping
        //hook is used to connect to the next node that is the 1st ListNode of 2 swapped ListNodes
        ListNode slow = head, fast, hook = new ListNode();
        head = hook;

        while(slow != null){
            fast = slow.next;
            //if there's no fast ListNode, then no swap needed
            if(fast == null) break;
            //swap the slow and fast ListNodes
            slow.next = fast.next;
            fast.next = slow;
            //update hook after swapped 2 adjacent ListNodes
            hook.next = fast;
            hook = fast.next;

            slow = slow.next;
        }
        return head.next;

    }
}
