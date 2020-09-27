package linkedList;

/**
 * @Author 袁媛
 * @Date 2020/9/27
 * @Time 23:13
 */
import java.util.Iterator;

public class MyLinkedList<E> extends MyAbstractList<E>{

    private Node<E> head;//头指针
    private Node<E> tail;//尾指针
    private int size = 0;//链表长度

    public MyLinkedList() {

    }

    public MyLinkedList(E[] elements) {
        for(int i = 0; i < elements.length; i++) {
            addLast(elements[i]);
        }
    }

    public int size() {
        return size;
    }

    protected E getFirst() {
        // TODO Auto-generated method stub
        if(size == 0) {
            return null;
        }else {
            return head.element;
        }
    }

    protected E getLast() {
        // TODO Auto-generated method stub
        if(size == 0) {
            return null;
        }else {
            return tail.element;
        }
    }

    public void add(E e) {
        addLast(e);
    }

    protected void addFirst(E e) {
        // TODO Auto-generated method stub
        Node<E> newNode = new Node<>(e);//创建新的Node
        newNode.next = head;//将newNode节点的next节点设为head指针指向的节点
        head = newNode;//head指针重新指向新加入的节点
        size++;

        if(tail == null) {//如果链表为空，将尾指针也指向newNode
            tail = newNode;
        }
    }

    protected void addLast(E e) {
        // TODO Auto-generated method stub
        Node<E> newNode = new Node<>(e);//创建新的Node

        if(tail == null) {//如果链表为空，将头指针和尾指针指向newNode
            head = tail = newNode;
        }else {
            tail.next = newNode;//将尾指针指向的Node的next节点设为newNode
            tail = newNode;//尾指针指向新加入的节点
        }

        size++;
    }

    @Override
    public void add(int index, E e) {
        // TODO Auto-generated method stub
        if(index <= 0) {
            addFirst(e);
        }else if(index >= size) {
            addLast(e);
        }else {
            Node<E> current = head;
            for(int i = 1; i < index; i++) {
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = new Node<E>(e);
            (current.next).next = temp;
            size++;
        }
    }

    //判断下标是否合法
    private void checkIndex(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index " + index + " out of bounds");
        }
    }

    protected E removeFirst() {
        // TODO Auto-generated method stub
        if(size == 0) {
            return null;
        }else {
            Node<E> temp = head;
            head = head.next;
            size--;
            if(head == null) {
                tail = null;
            }
            return temp.element;
        }
    }

    protected E removeLast() {
        // TODO Auto-generated method stub
        if(size == 0) {
            return null;
        }else if(size == 1){
            Node<E> temp = head;
            head = tail = null;
            size = 0;
            return temp.element;
        }else {
            Node<E> current = head;
            for(int i = 1; i < size - 1; i++) {
                current = current.next;
            }
            Node<E> temp = tail;
            tail = current;
            tail.next = null;
            size--;
            return temp.element;
        }
    }

    @Override
    public E remove(int index) {
        // TODO Auto-generated method stub
        if(index < 0 || index >= size) {
            return null;
        }else if(index == 0) {
            return removeFirst();
        }else if(index == size - 1) {
            return removeLast();
        }else {
            Node<E> pervious = head;
            for(int i = 1; i < index; i++) {
                pervious = pervious.next;
            }
            Node<E> current = pervious.next;
            pervious.next = current.next;
            size--;
            return current.element;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");

        Node<E> current = head;
        for(int i = 0; i < size; i++) {
            result.append(current.element);
            current = current.next;
            if(current != null) {
                result.append("，");
            }
        }
        return result.toString() + "]";
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        size = 0;
        head = tail = null;
    }

    @Override
    public boolean contains(E e) {
        // TODO Auto-generated method stub
        Node<E> current = head;
        if(current.element.equals(e)) {
            return true;
        }
        for(int i = 1; i < size; i++) {
            current = current.next;
            if(current.element.equals(e)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public E get(int index) {
        // TODO Auto-generated method stub
        checkIndex(index);
        if(index == 0) {
            return head.element;
        }else if(index == size - 1) {
            return tail.element;
        }else {
            Node<E> current = head;
            for(int i = 1; i < size - 1; i++) {
                current = current.next;
                if(i == index) {
                    return current.element;
                }
            }
        }
        return null;
    }

    @Override
    public int indexOf(E e) {
        // TODO Auto-generated method stub
        if(e.equals(head.element)) {
            return 0;
        }else {
            Node<E> current = head;
            for(int i = 1; i < size; i++) {
                current = current.next;
                if(e.equals(current.element)) {
                    return 1;
                }
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(E e) {
        // TODO Auto-generated method stub
        if(e.equals(tail.element)) {
            return size - 1;
        }else {
            Node<E> current = head;
            int result = -1;
            for(int i = 1; i < size; i++) {
                current = current.next;
                if(e.equals(current.element)) {
                    result = i;
                }
            }
            return result;
        }
    }

    @Override
    public E set(int index, E e) {
        // TODO Auto-generated method stub
        checkIndex(index);
        E result = null;
        if(index == 0) {
            result = head.element;
            head.element = e;
            return result;
        }else if(index == size - 1) {
            result = tail.element;
            tail.element = e;
            return result;
        }else {
            Node<E> current = head;
            for(int i = 1; i < size - 1; i++) {
                current = current.next;
                if(index == i) {
                    result = current.element;
                    current.element = e;
                    break;
                }
            }
            return result;
        }
    }

    @Override
    public Iterator<E> iterator() {
        // TODO Auto-generated method stub
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<E> {

        private Node<E> current = head;

        @Override
        public boolean hasNext() {
            // TODO Auto-generated method stub
            return current != null;
        }

        @Override
        public E next() {
            // TODO Auto-generated method stub
            E e = current.element;
            current = current.next;
            return e;
        }
    }
}
