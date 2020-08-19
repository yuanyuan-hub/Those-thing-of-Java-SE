import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author 袁媛
 * @Date 2020/8/14
 * @Time 17:23
 */

//int[] array = {1,2,3,4,5,6,7,8,9};
//将奇数放在偶数前面，无序关心变化后的数据是否有序。
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int count = 0;
        while( i != 0) {
            i = i & (i - 1);
            count ++;
        }
        System.out.println(count);
    }
    public static void main3(String[] args) {
        char c = 'a';
        System.out.println(c+1);
    }
    public static void main2(String[] args) {
        int a = 5;
//        if( a = 0 ){
//            System.out.println();
//
//        } else
        {
            System.out.println(a++);
        }
    }
    public static void main1(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        isSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void isSort(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            while (left < right && array[left] % 2 == 1) {
                left++;
            }
            while (left < right && array[right] % 2 == 0) {
                right--;
            }
            int tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
        }
    }
}
