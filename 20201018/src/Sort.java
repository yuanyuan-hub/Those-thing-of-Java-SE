/**
 * @Author 袁媛
 * @Date 2020/10/18
 * @Time 15:51
 */
public class Sort {
    public static void insertSort(long[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            long key = array[i + 1];
            int j;
            for ( j = i; j >= 0 ; j--) {
                if (key < array[j]) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = key;
        }
    }
    public static void bubbleSort(long[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if(array[j] > array[j+1]) {

                }
            }
        }
    }

    public static void selectSort(long[] array) {
        //无序区间  [0,array.length - i]
        //有序区间  [array.length - i,array.length]
        for (int i = 0; i < array.length - 1; i++) {
            int k = 0;
            for (int j = 0; j < array.length - i; j++) {
                if(array[j] > array[j+1]) {
                     k = j;
                }
            }
        }
    }
}
