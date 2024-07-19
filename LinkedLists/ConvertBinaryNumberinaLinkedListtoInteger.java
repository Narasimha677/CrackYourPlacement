package LinkedLists;

public class ConvertBinaryNumberinaLinkedListtoInteger {
    public int getDecimalValue(ListNode head) {
        StringBuilder binary=new StringBuilder();
        ListNode temp=head;
        while(temp!=null){
            binary.append(temp.val);
            temp=temp.next;
        }
        String bin=binary.toString();
        return Integer.parseInt(bin,2);

    }
}
