// Problem1.java
public class Problem1 {
    public static ListNode concatenate(ListNode l1, ListNode l2) {
        // TODO: Implement the concatenate method
        // This method should concatenate l2 to l1 and return l1
        // Remember to create new nodes instead of directly linking l1 to l2
        ListNode current1 = l1;
        while (current1.next != null) {
            current1 = current1.next;
        }
        ListNode current2 = l2;
        while (current2 != null) {
            current1.next = new ListNode(current2.val);
            current1 = current1.next;
            current2 = current2.next;
        }
        return l1;
    }
}