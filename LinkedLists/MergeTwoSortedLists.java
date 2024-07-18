package LinkedLists;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1=list1;
        ListNode temp2=list2;
        ListNode head=new ListNode(-1);
        ListNode temp3=head;
        while(temp1!=null && temp2!=null){
            if(temp1.val<temp2.val){
                ListNode node=new ListNode(temp1.val);
                temp3.next=node;
                temp3=node;
                temp1=temp1.next;
            }else{
                ListNode node=new ListNode(temp2.val);
                temp3.next=node;
                temp3=node;
                temp2=temp2.next;
            }
        }
        while(temp1!=null){
            ListNode node=new ListNode(temp1.val);
            temp3.next=node;
            temp3=node;
            temp1=temp1.next;
        }
        while(temp2!=null){
            ListNode node=new ListNode(temp2.val);
            temp3.next=node;
            temp3=node;
            temp2=temp2.next;
        }

        head=head.next;
        return head;
    }
}
