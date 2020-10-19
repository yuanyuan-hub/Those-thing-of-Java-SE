import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @Author 袁媛
 * @Date 2020/10/18
 * @Time 14:46
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLong()) {
            long n = scanner.nextLong();
            System.out.println(Arrays.toString(Transition(n)));
        }
    }

    public static int[] Transition(long n) {
        Deque<Integer>stack = new LinkedList<>();
        while (n > 0) {
            int x = (int)(n % 10);
            stack.push(x);
            n = n / 10;
        }
        int[] array = new int[stack.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
        return array;
    }
}
