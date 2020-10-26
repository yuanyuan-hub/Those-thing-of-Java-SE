import java.util.Set;
import java.util.TreeSet;

/**
 * @Author 袁媛
 * @Date 2020/10/25
 * @Time 16:41
 */
public class Main {
    public static void main(String[] args) {
        Set<String>set = new TreeSet<>();
        System.out.println(set.add("apple"));
        System.out.println(set.add("banana"));
        System.out.println(set.add("orange"));
        System.out.println(set.add("peach"));
        System.out.println(set.size());
        System.out.println(set);
        System.out.println(set.add("apple"));
        System.out.println(set.contains("apple"));
        System.out.println(set.contains("water"));
        System.out.println(set.remove("apple"));
        System.out.println(set.remove("pppp"));
    }
}
