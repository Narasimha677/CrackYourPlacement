package LinkedLists;

public class SortList {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode head2=mid(head);
        ListNode list1=sortList(head);
        ListNode list2=sortList(head2);
        return merge(list1,list2);


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
    public ListNode merge(ListNode list1, ListNode list2) {
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
