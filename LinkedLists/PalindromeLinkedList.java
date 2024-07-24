package LinkedLists;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if(head==null){
            return false;
        }
        if(head.next==null){
            return true;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev=null;
        ListNode pres=slow.next;
        ListNode next=pres.next;
        while(pres!=null){
            pres.next=prev;
            prev=pres;
            pres=next;
            if(next!=null){
                next=next.next;
            }
        }
        ListNode newHead=prev;
        ListNode temp1=head;
        ListNode temp2=newHead;
        while(temp2!=null){
            if(temp1.val!=temp2.val){
                return false;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        prev=null;
        pres=newHead;
        next=newHead.next;
        while(pres!=null){
            pres.next=prev;
            prev=pres;
            pres=next;
            if(next!=null){
                next=next.next;
            }
        }

        return true;


    }
}
