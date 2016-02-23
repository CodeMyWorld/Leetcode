import java.util.ArrayList;

/**
 * Created by alex on 16-2-22.
 */
public class Solution19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = head;
        ArrayList<ListNode> list = new ArrayList<>();
        while(node != null){
            list.add(node);
            node = node.next;
        }
        int index = list.size()-n-1;
        if(index < 0){
            return head.next;
        }
        node = list.get(index);
        node.next = node.next.next;
        return head;
    }
}

