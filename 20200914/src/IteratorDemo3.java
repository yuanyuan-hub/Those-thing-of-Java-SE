import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author 袁媛
 * @Date 2020/9/14
 * @Time 21:35
 */
public class IteratorDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        Iterator<String>it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if(next.equals("C")) {
                it.remove();
            }
        }
        System.out.println(list);
    }
}
