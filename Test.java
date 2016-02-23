/**
 * Created by alex on 16-2-22.
 */
public class Test {
    public static void main(String[] arg) {
        Solution21 solution21 = new Solution21();
        ListNode l1 = null;
        ListNode l2 = new ListNode(0);
        l2.next = new ListNode(4);
        ListNode head = solution21.mergeTwoLists(l1,l2);
        while(head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }
}
