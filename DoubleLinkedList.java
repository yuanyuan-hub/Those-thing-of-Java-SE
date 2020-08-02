import java.util.List;

/**
 * @Author 袁媛
 * @Date 2020/7/31
 * @Time 10:54
 */

class ListNode {
    public int data;
    public ListNode next;
    public ListNode prev;

    public ListNode(int data) {
        this.data = data;
    }
}

public class DoubleLinkedList {
    public ListNode head;
    public ListNode tail;
    //头插法
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
        }
    }
    //尾插法
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        if (this.head == null) {
            this.tail = node;
            this.head = node;
        } else {
            this.tail.next = node;
            node.prev = this.tail;
            this.tail = node;
        }
    }
    //打印链表
    public void display() {
        ListNode cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }
    //任意位置插入，第一个数据节点为0的下标
    public void addIndex (int index,int data) {
        if (index < 0 || index > size()) {
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == size()) {
            addLast(data);
            return;
        }
        ListNode cur = searchIndex(index);
        ListNode node = new ListNode(data);
        node.next = cur;
        node.prev = cur.prev;
        cur.prev.next = node;
        cur.prev = node;
    }
    public ListNode searchIndex(int index) {
        ListNode cur = this.head;
        while (index > 0) {
            cur = cur.next;
            index --;
        }
        return cur;
    }
    //求链表长度
    public int size() {
        ListNode cur = this.head;
        int count = 0;
        while (cur != null) {
            cur = cur.next;
            count++;
        }
        return count;
    }
    //删除第一次出现关键字为key的点
    public void remove(int key) {
        ListNode cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                //删除的是否为头节点
                if (cur == this.head) {
                    this.head = this.head.next;
                    this.head.prev = null;
                } else {
                    cur.prev.next = cur.next;
                    if (cur.next != null) {
                        //删除的不是尾结点
                        cur.next.prev = cur.prev;
                    } else {
                        this.tail = cur.prev;
                    }
                }
                //删除完成
                return;
            } else {
                cur = cur.next;
            }
        }
    }
    //删除所有key节点
    public void removeAllkey (int key) {
        ListNode cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                //删除的是否为头节点
                if (cur == this.head) {
                    this.head = this.head.next;
                    this.head.prev = null;
                } else {
                    cur.prev.next = cur.next;
                    if (cur.next != null) {
                        //删除的不是尾结点
                        cur.next.prev = cur.prev;
                    } else {
                        this.tail = cur.prev;
                    }
                }
            }
            cur = cur.next;
        }
    }
    //清空回收链表
    public void clear() {
        ListNode cur = this.head;
        ListNode curNext;
        while (cur != null) {
            curNext = cur.next;
            cur.next = null;
            cur.prev = null;
            cur = curNext;
        }
        this.head = null;
        this.tail = null;
    }
    //查找是否包含关键字key
    public boolean contains (int key) {
        if (head == null) {
            return false;
        }
        ListNode cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
}
