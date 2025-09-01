class Solution {
    public void reorderList(ListNode h) {
        if (h == null || h.next == null) return;
        ListNode s = h, f = h;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        ListNode p = null, c = s.next;
        s.next = null;
        while (c != null) {
            ListNode t = c.next;
            c.next = p;
            p = c;
            c = t;
        }
        ListNode a = h, b = p;
        while (b != null) {
            ListNode t1 = a.next, t2 = b.next;
            a.next = b;
            b.next = t1;
            a = t1;
            b = t2;
        }
    }
}
