

/**
 * Created by alex on 16-2-22.
 */
public class Test {
    public static void main(String[] arg) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        Solution92 solution92 = new Solution92();
        ListNode result = solution92.reverseBetween(n1, 1, 5);
        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }
}
