class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(-1);
        ListNode t = ans;
        int sum=0;
        int carry =0;
        while(l1!=null || l2!=null) {
            if(l1!=null) {
                sum+=l1.val;
                l1 = l1.next;
            }
            if(l2!=null) {
                sum+=l2.val;
                l2=l2.next;
            }
            sum+=carry;
            ListNode nex = new ListNode(sum%10);
            t.next = nex;
            t=nex;
            carry = sum/10;
            sum=0;
        }
        if(carry ==1) {
            ListNode nex = new ListNode(carry);
            t.next = nex;
            t=nex;
        }
        return ans.next;
    }
}//found