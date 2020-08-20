import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author 袁媛
 * @Date 2020/8/20
 * @Time 10:58
 */
public class Test {
    //求一个数组中前k个最小的数字。
    //如：{1,2,3,2,2,2,5,4,2} 当k等于3为。前3个最小的数字为 1 2 2

    public static void main(String[] args) {
        int[] array = {1,2,3,2,2,2,5,4,2};
        find(array);
       // System.out.println(Arrays.toString(array));
    }

    public static void find(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if(array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        int k = 3;
        if (k < array.length) {
            for (int i = 0; i < k; i++) {
                System.out.print(array[i] + " ");
            }
        } else {
            System.out.println("输入有误！");
        }
    }

    //求一个有序数组中，两个值相加为key的数字，返回这两个数字的下标。
    static boolean foo(char c) {
            System.out.print(c);
            return true;
        }
        public static void main2( String[] argv ) {
            int i = 0;
            for ( foo('A'); foo('B') && (i < 2); foo('C')) {
                i++ ;
                foo('D');
            }
        }
    //示例：int[] array = {1,2,3,4,5,7,7,8}; key = 8 找到下标为：(0,6) 返回这两个值。
    public static void main1(String[] args) {
        int[] array = {1,2,3,4,5,7,7,8};
        int key = 8;
        toFind(array,key);
    }
    public static void toFind(int[] array,int key) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            if(key < array[left] + array[right]) {
                right --;
            } else if (key > array[left] + array[right]) {
                left ++;
            } else {
                break;
            }
        }
        System.out.println("(" + left + "," + right + ")");
    }
}
