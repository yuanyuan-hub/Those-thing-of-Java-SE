/**
 * @Author 袁媛
 * @Date 2020/8/2
 * @Time 22:44
 */


class Node {
    public int data;
    public Node next;
}

public class Demo {
    public Node head;
    public Node removeElements( int val) {
        Node cur = this.head.next;
        Node prve = this.head;
        if(this.head == null) {
            return null;
        }
        while (cur != null) {
            if(cur.data == val) {
                prve.next = cur.next;
                cur = cur.next;
            } else {
                prve.next = cur;
                cur = cur.next;
            }
        }
        if (this.head.data == val) {
            head = head.next;
        }
        return this.head;
    }
}
