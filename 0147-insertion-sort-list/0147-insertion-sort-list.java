class Solution{
    public ListNode insertionSortList(ListNode head){
        if(head==null||head.next==null)return head;
        ListNode x=new ListNode(0);
        ListNode curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            ListNode prev=x;
            while(prev.next!=null&&prev.next.val<curr.val)prev=prev.next;
            curr.next=prev.next;
            prev.next=curr;
            curr=next;
        }
        return x.next;
    }
}
