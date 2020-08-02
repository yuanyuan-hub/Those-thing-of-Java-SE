/**
 * @Author 袁媛
 * @Date 2020/7/31
 * @Time 17:47
 */
 class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }
}

//链表开始入环的第一个节点
//给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null
public class singleLinkedList {
     public Node head;

    public Node mergeTwoLists() {
        Node newHead = new Node(1);
        Node headA = this.head;
        Node headB = this.head;

        Node tmp = newHead;
        while (headA != null && headB != null) {
            if (headA.data < headB.data) {
                tmp.next = headA;
                tmp = tmp.next;
                headA = headA.next;
            } else {
                tmp.next = headB;
                tmp = tmp.next;
                headB = headB.next;
            }
            if (headA != null) {
                tmp.next = headA;
            }
            if (headB != null) {
                tmp.next = headB;
            }
            return newHead.next;
        }
    }
     //删除链表中等于给定值 val 的所有节点

    // 以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
    // 给定一个链表的头指针 ListNode* pHead，请返回重新排列后的链表的头指针。
    // 注意：分割以后保持原来的数据顺序不变。
    public Node partition(int x) {
        Node bs = null;
        Node be = null;
        Node as = null;
        Node ae = null;
        Node cur = this.head;
        while (cur != null) {
            if (cur.data < x) {
                if(bs == null) {
                   bs = cur;
                   be = bs;
                } else {
                    bs.next = cur;
                    be = cur;
                }
            } else {
                if (as == null) {
                    as = cur;
                    ae = as;
                } else {
                    as.next = cur;
                    bs = cur;
                }
            }
            cur = cur.next;
        }
        if (bs == null) {
            return as;
        }
        be.next = as;
        if (as != null) {
            ae.next = null;
        }
        return bs;
    }


    //在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
    //例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
    public Node deleteDuplication() {
        Node newHead = new Node(-1);
        Node tmp = newHead;
        Node cur = this.head;
        while(cur != null) {
             if(cur.next != null && cur.data == cur.next.data) {
                while (cur.next != null && cur.data == cur.next.data) {
                    cur = cur.next;
                }
                cur = cur.next;
            } else{
                tmp.next = cur;
                tmp = cur;
                cur = cur.next;
            }
        }
        tmp.next = null;
        return newHead.next;
    }
     //链表的回文结构
     public boolean chkPalindrome() {
         Node fast = this.head;
         Node slow = this.head;
         while (fast != null && fast.next != null) {
             fast = fast.next.next;
             slow = slow.next;
         }
         Node cur = slow.next;
         while (cur != null) {
             Node curNext = cur.next;
             cur.next = slow;
             slow = cur;
             cur = cur.next;
         }
         while (this.head != slow) {
             if (this.head.data != slow.data) {
                 return false;
             }
             if (this.head.next == slow) {
                 return true;
             }
             slow = slow.next;
             this.head = this.head.next;
         }
         return true;
     }
     //输入两个链表，找出它们的第一个公共结点
    public Node publicNode () {
        int count1 = 0;
        int count2 = 0;
        int count = 0;
        Node cur1 = this.head;
        Node cur2 = this.head;
        while (cur1 != null) {
            cur1 = cur1.next;
            count1 ++;
        }
        while (cur2 != null) {
            cur2 = cur2.next;
            count2 ++;
        }
        cur1 = this.head;
        cur2 = this.head;
        if (count1 > count2) {
            count = count1 - count2;
            while (count > 0) {
                cur1 = cur1.next;
                count--;
            }
        } else {
            count =count2 - count1;
            while (count > 0) {
                cur2 = cur2.next;
                count --;
            }
        }
        while (cur1 != cur2 && cur1 !=null && cur2 != null) {
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        if (cur1 == cur2 && cur1 != null) {
            return cur1;
        }
        return null;
    }

     //给定一个链表，判断链表中是否有环
    public boolean ring() {
        Node fast = this.head;
        Node slow = this.head;
        while(fast != null && fast.next != null ) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                System.out.println("有环！");
                return true;
            }
        }
        System.out.println("无环！");
        return false;
    }
     public Node firstNode() {
         Node fast = this.head;
         Node slow = this.head;
         while (fast != null && fast.next != null) {
             fast = fast.next.next;
             slow = slow.next;
             if (fast == slow) {
                 break;
             }
         }
         if( fast == null || fast.next == null) {
             return null;
         }
         slow = head;
         while (slow != head) {
             slow = slow.next;
             fast = fast.next;
         }
         return slow;
    }

    public void display () {
         Node cur = this.head;
         while (cur != null) {
             System.out.println(cur.data + " ");
             cur = cur.next;
         }
        System.out.println();
    }
}

