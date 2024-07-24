package LinkedLists;

public class IntersectionofTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int list1Size=0;
        int list2Size=0;
        ListNode temp1=headA;
        ListNode temp2=headB;
        if(temp1==temp2){
            return temp1;
        }
        while(temp1.next!=null && temp2.next!=null){
            if(temp1==temp2){
                return temp1;
            }
            temp1=temp1.next;
            temp2=temp2.next;

        }
        if(temp1.next!=null){
            int count =0;
            while(temp1.next!=null){
                count++;
                temp1=temp1.next;
            }
            temp1=headA;
            for(int i=0;i<count;i++){
                temp1=temp1.next;
            }
            temp2=headB;
            while(temp1!=temp2){
                temp1=temp1.next;
                temp2=temp2.next;

            }
            return temp1;
        }
        if(temp2.next!=null){
            int count =0;
            while(temp2.next!=null){
                count++;
                temp2=temp2.next;
            }
            temp2=headB;
            for(int i=0;i<count;i++){
                temp2=temp2.next;
            }
            temp1=headA;
            while(temp1!=temp2){
                temp1=temp1.next;
                temp2=temp2.next;

            }
            return temp1;
        }
        return null;


    }
}
