import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author 袁媛
 * @Date 2020/9/14
 * @Time 21:32
 */
public class IteratorDemo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        Iterator<String>it1 = list.iterator();
        Iterator<String>it2 = list.iterator();
        it1.next();
        it1.next();
        System.out.println(it1.next());
        System.out.println(it2.next());
    }
}
