package LinkedLists;

public class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        temp=head;
        if(count==n){
            return head.next;
        }
        for(int i=count;i>n+1;i--){
            temp=temp.next;
        }


        temp.next=temp.next.next;
        return head;

    }
}
