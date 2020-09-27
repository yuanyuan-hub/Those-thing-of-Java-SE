/**
 * @Author 袁媛
 * @Date 2020/9/27
 * @Time 23:09
 */
public class Node {
    Node previous;
    Object object;
    Node next;
    public Node() {
    }

    public Node(Node privious, Object object, Node next) {
        super();
        this.previous = privious;
        this.object = object;
        this.next = next;
    }

    public Node getPrivious() {
        return previous;
    }
    public void setPrivious(Node privious) {
        this.previous = privious;
    }
    public Object getObject() {
        return object;
    }
    public void setObject(Object object) {
        this.object = object;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
}
