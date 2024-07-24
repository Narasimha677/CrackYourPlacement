package LinkedLists;

public class ReorderList {
    public void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return;
        }
        ListNode head1=head;
        ListNode head2=mid(head);
        head2=reverse(head2);
        ListNode temp=head;
        ListNode temp2=head2;
        while(temp.next!=null){
            ListNode node=temp2.next;
            temp2.next=temp.next;
            temp.next=temp2;
            temp=temp.next.next;
            temp2=node;

        }
        if(temp2!=null){
            temp.next=temp2;
        }


    }
    public ListNode mid(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode head2=slow.next;
        slow.next=null;
        return head2;
    }
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode pres=head;
        ListNode next=head.next;

        while(pres!=null){
            pres.next=prev;
            prev=pres;
            pres=next;
            if(next!=null){

                next=next.next;
            }
        }
        return prev;
    }
}
