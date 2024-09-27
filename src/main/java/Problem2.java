
public class Problem2 {
    public static ListNode insert(ListNode head, int val, int position) {
        // TODO: Implement the insert method
        // This method should insert a new node with the given value at the specified position
        // If the position is out of bounds, insert the node at the end of the list
        int pos = 1;
        ListNode current = head;
        ListNode newNode = new ListNode(val);
        if(position == 1){
            newNode.next = head;
            head = newNode;
            return head;
        }
        while (current.next!=null && pos<position-1){
            current = current.next;
            pos++;
        }
        newNode.next = current.next;
        current.next = newNode;
        return head;
    }
}
