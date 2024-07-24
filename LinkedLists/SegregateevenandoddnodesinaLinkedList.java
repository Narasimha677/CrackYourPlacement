package LinkedLists;

public class SegregateevenandoddnodesinaLinkedList {
    public ListNode oddEvenList(ListNode head) {
        ListNode temp=head;
        ListNode prev=null;
        ListNode pres=head;
        int i=1;
        while(pres!=null){
            if(i!=1&&i%2!=0){
                ListNode node=temp.next;
                prev.next=pres.next;
                temp.next=pres;
                pres.next=node;
                temp=temp.next;
                pres=prev.next;
                i++;
            }else{
                prev=pres;
                pres=pres.next;
                i++;
            }


        }
        return head;

    }
}
