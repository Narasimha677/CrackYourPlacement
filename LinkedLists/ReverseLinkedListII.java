package LinkedLists;

public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null){
            return head;
        }
        if(left==right){
            return head;
        }
        ListNode prevRevStart=null;
        ListNode newEnd=null;
        ListNode prev=null;
        ListNode pres=head;
        for(int i=2;i<=left;i++){
            prev=pres;
            pres=pres.next;
        }
        prevRevStart=prev;
        newEnd=pres;
        prev=null;
        ListNode next=pres.next;
        for(int i=left;i<=right;i++){
            pres.next=prev;
            prev=pres;
            pres=next;
            if(next!=null){

                next=next.next;
            }
        }
        if(prevRevStart==null){
            head=prev;
        }
        else{

            prevRevStart.next=prev;
        }
        newEnd.next=pres;

        return head;

    }
}
