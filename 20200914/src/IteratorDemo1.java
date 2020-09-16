import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author 袁媛
 * @Date 2020/9/14
 * @Time 21:17
 */
public class IteratorDemo1 {
    public static void main(String[] args) {
        List<String>list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        Iterator<String>it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
        }
        for (String next:list) {
            System.out.println(next);
        }
    }
}
