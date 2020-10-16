/**
 * @Author 袁媛
 * @Date 2020/10/14
 * @Time 21:01
 */
public class Heap {

    public void adjustUp(int[] array,int size,int index) {
        while (true) {
            //1.判断 index 是不是树的根
            if(index == 0) {
                break;
            }
            //2.跟父节点比较  大于父节点的值 退出
            int parent = (index - 1) / 2;
            if(array[parent] <= array[index]) {
                break;
            }
            //交换父节点和index的值
            int t = array[parent];
            array[parent] = array[index];
            array[index] = t;
            //3.把父节点视为孩子继续比价
            index = parent;
            //4.到顶，退出
        }
    }


    //向下调整
    public static void shiftDown(int[] array,int size,int index) {
        while (true) {
            //1.判断是否为叶子节点
            int left = index * 2 + 1;
            if(left >= size) {
                return;
            }
            //2.找左右孩子中最小的孩子
            int min = left;
            int right = left + 1;
            if(right < size && array[right] < array[left]) {
                min = right;
            }
            //判断小孩子和 index 位置的值的大小
            if(array[index] <= array[min]) {
                return;
            }
            //3.交换
            int t = array[min];
            array[min] = array[index];
            array[index] = t;
            //4.继续比较
            index = min;
        }
    }


    //建堆操作
    public static void createHeap(int[] array,int size) {
        for (int i = (size -1 - 1) / 2; i >= 0 ; i--) {
            shiftDown(array,size,i);
        }
    }

}
