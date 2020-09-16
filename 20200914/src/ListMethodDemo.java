import java.util.ArrayList;
import java.util.List;

/**
 * @Author 袁媛
 * @Date 2020/9/14
 * @Time 19:37
 */

public class ListMethodDemo {
    public static void main(String[] args) {
        List<String>list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("wo");
        list.add("shi");
        list.add("haoren");
        System.out.println(list);
        list.add(3,"哎");
        System.out.println(list);
        String s = list.get(2);
        System.out.println(s);
        list.set(4,"hao");
        System.out.println(list);
        System.out.println(list.size());
    }
}
