/**
 * Created by alex on 16-2-23.
 */
public class Solution21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null){
            return l2;
        }else if(l2 == null){
            return l1;
        }
        ListNode head;
        if(l1.val < l2.val){
            head = l1;
            l1 = l1.next;
        }else {
            head = l2;
            l2 = l2.next;
        }
        ListNode node = head;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                node.next = l1;
                node = l1;
                l1 = l1.next;
            }else {
                node.next = l2;
                node = l2;
                l2 = l2.next;
            }
        }
        if(l1 == null){
            node.next = l2;
        }else{
            node.next = l1;
        }
        return head;
    }
}
