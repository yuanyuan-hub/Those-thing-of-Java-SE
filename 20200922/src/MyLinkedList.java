/**
 * @Author 袁媛
 * @Date 2020/9/27
 * @Time 23:06
 */

public class MyLinkedList {
    private Node first;
    private Node last;
    private int size;

    public void add(Object obj) {//在末尾添加元素
        Node n = new Node();
        if(first==null) {
            n.setPrivious(null);
            n.setObject(obj);
            n.setNext(null);
            first = n;
            last = n;
        }else {
            n.setPrivious(last);
            n.setObject(obj);
            n.setNext(null);
            last.setNext(n);
            last = n;
        }
        size++;
    }

    public void add(int index,Object obj) {//在指定位置添加元素
        Node temp = node(index);
        Node newNode = new Node();
        newNode.object = obj;
        if(index==0) {//指定第一个位置添加元素
            first = newNode;
            temp.previous = newNode;
            newNode.next = temp;
            size++;
        }else if(index ==size) {//指定最后一个位置添加元素
            add(obj);
        }else {
            Node up = temp.previous;
            up.next = newNode;
            newNode.previous = up;
            newNode.next = temp;
            temp.previous = newNode;
            size++;
        }
    }

    public int size() {//返回列表大小
        return size;
    }

    public Object get(int index) {//返回指定位置的对象
        rangeCheck(index);
        Node temp = node(index);
        if(temp!=null) {
            return temp.object;
        }
        return null;

    }

    private void rangeCheck(int index) {
        if(index<0||index>=size) {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void remove(int index){//删除指定位置的对象元素
        Node temp = node(index);
        if(index==0) {
            temp.next.previous = null;
            first = temp.next;
        }
        else if(temp.next==null) {
            last = temp.previous;
        }else {
            Node up = temp.previous;
            Node down = temp.next;
            up.next = down;
            down.previous = up;
        }
        size--;
    }
    public void clear() {

    }

    public Node node(int index) {//返回指定位置的对象元素
        Node temp = null;
        if(first!=null) {
            if(index<(size>>1)) {
                temp = first;
                for(int i=0;i<index;i++) {
                    temp = temp.next;
                }

            }else {
                temp = last;
                for(int i=size-1;i>index;i--) {
                    temp = temp.previous;
                }
            }
        }
        return temp;
    }



    public static void main(String[] args) {
        MyLinkedList list= new MyLinkedList();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        //list.add(0,"000");
        //list.add(3, 333);
        //list.remove(2);
        System.out.println(list.size);
        System.out.println(list.get(3));
        for(int i=0;i<list.size;i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}
