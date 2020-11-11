import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

/**
 * @Author 袁媛
 * @Date 2020/11/10
 * @Time 14:48
 */
public class Demo {
    public static void main(String[] args) {

    }
    public char findTheDifference(String s,String t) {
        char ans = t.charAt(t.length() - 1);
        for (int i = 0; i < s.length(); i++) {
            ans ^= s.charAt(i);
            ans ^= t.charAt(i);
        }
        return ans;
    }


    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        //split分隔符
        String[] array = temp.split(",");
        //把字符串转为整形
        int a = Integer.parseInt(array[0]),b = Integer.parseInt(array[1]);
        System.out.println("a="+array[1]+","+"b="+array[0]);
    }



    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  x = sc.next();
        System.out.println("year="+x.substring(0,4));
        System.out.println("month="+x.substring(4,6));
        System.out.println("date="+x.substring(6,8));
    }
    public static void main1(String[] args) {
        Collection<String> list = new ArrayList<>();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.add("我");
        list.add("爱");
        list.add("中国");
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        //转数组
        Object[] array = list.toArray();
        System.out.println(Arrays.toString(array));
        for (String s : list) {
            System.out.println(s);
        }
        list.remove("爱");
        for (String s : list) {
            System.out.println(s);
        }
        list.clear();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
    }
}
