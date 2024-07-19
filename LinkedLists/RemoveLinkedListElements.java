package LinkedLists;

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return null;
        }
        ListNode prev=null;
        ListNode pres=head;
        while(pres!=null){
            if(prev==null && pres.val==val){
                ListNode temp=pres.next;
                pres.next=null;
                pres=temp;
                head=temp;
                continue;
            }
            if(pres.val==val){
                prev.next=pres.next;
                pres=pres.next;
                continue;
            }
            prev=pres;
            pres=pres.next;
        }

        return head;

    }
}
