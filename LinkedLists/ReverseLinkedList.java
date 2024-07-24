package LinkedLists;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        //Recursion
        if(head==null || head.next==null){
            return head;
        }
        ListNode newHead=reverseList(head.next);
        ListNode front=head.next;
        front.next=head;
        head.next=null;
        return newHead;

        //Iterative
        // ListNode prev=null;
        // ListNode pres=head;
        // ListNode next=head.next;

        // while(pres!=null){
        //     pres.next=prev;
        //     prev=pres;
        //     pres=next;
        //     if(next!=null){

        //     next=next.next;
        //     }
        // }
        // return prev;

    }
}
