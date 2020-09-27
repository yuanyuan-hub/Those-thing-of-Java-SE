package linkedList;

/**
 * @Author 袁媛
 * @Date 2020/9/27
 * @Time 23:14
 */
public class TestMyLinkedList {

    public static void main(String[] args) {

        // String[] ss = {"China","America","Germany","Canada","France","Germany"};
        MyLinkedList<String> list = new MyLinkedList<String>();
        System.out.println("测试list的add()方法");
        list.add("America");
        list.addFirst("China");
        list.add("Canada");
        list.addLast("France");
        list.add(2,"Germany");
        list.addLast("Germany");
        list.add("Germany");
        list.addFirst("Germany");
        System.out.println("测试toString()方法：" + list.toString());
        System.out.println("测试indexOf()方法：" + list.indexOf("Germany"));
        System.out.println("测试lastIndexOf()方法：" + list.lastIndexOf("Germany"));
        System.out.println("测试getFirst()方法：" + list.getFirst());
        System.out.println("测试getLast()方法：" + list.getLast());
        System.out.println("测试remove()方法");
        System.out.println("删除下标为3的元素：" + list.remove(3));
        System.out.println("删除第一个元素：" + list.removeFirst());
        System.out.println("删除最后的元素：" + list.removeLast());
        System.out.println(list.toString());
        System.out.println("测试contains()方法：" + list.contains("France"));
        System.out.println("测试get(int index)方法：" + list.get(3));
        System.out.println("测试set()方法：" + list.set(list.size()-1, "Russia"));
        System.out.println("foreach遍历链表：");
        for(String s:list) {
            System.out.print(s.toUpperCase() + " ");
        }
        System.out.println("");
        list.clear();
        System.out.println("测试clear()方法清空链表：" + list);
    }

}
