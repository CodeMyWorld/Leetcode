/**
 * Created by Alex on 2017/3/19.
 */
public class Solution92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m == n){
            return head;
        }
        int position = 1;
        ListNode preNode = null;
        ListNode currentNode = head;
        ListNode innerTail = null;
        ListNode innerHead = null;
        ListNode tempNode;
        ListNode lNode = null;
        ListNode rNode = null;
        while(currentNode != null && position <= n){
            if(position >= m){
                if(position == m){
                    innerTail = currentNode;
                    preNode = currentNode;
                    currentNode = currentNode.next;
                }else if(position == n){
                    rNode = currentNode.next;
                    innerHead = currentNode;
                    innerHead.next = preNode;
                    break;
                }else {
                    tempNode = currentNode;
                    currentNode = currentNode.next;
                    tempNode.next = preNode;
                    preNode = tempNode;
                }
            }else {
                preNode = currentNode;
                lNode = currentNode;
                currentNode = currentNode.next;
            }
            position++;
        }
        if(lNode != null){
            lNode.next = innerHead;
        }
        if(innerTail != null){
            innerTail.next = rNode;
        }
        if(m == 1){
            return innerHead;
        }else {
            return head;
        }
    }
}
