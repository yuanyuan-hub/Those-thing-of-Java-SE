/**
 * @Author 袁媛
 * @Date 2020/10/15
 * @Time 10:24
 */
public class MyPriorityQueue {
    private Integer[] array;
    private int size;

    public MyPriorityQueue() {
        array = new Integer[100];
        size = 0;
    }

    public Integer element() {
        if(size == 0) {
            throw new RuntimeException("空");
        }
        return array[0];
    }

    public Integer remove() {
        if(size == 0) {
            throw new RuntimeException("空");
        }

        int e = array[0];
        array[0] = array[size - 1];
        size--;
        adjustDown(0);
        return e;
    }
    public  void add(Integer e) {
        array[size] = e;
        size++;
        adjustUp(size-1);
    }
    public void adjustUp (int index) {
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

    private void adjustDown(int index) {
        while (true) {
            int left = index * 2 + 1;
            if(left >= size) {
                return;
            }
            int right = left + 1;
            int min = left;
            if(right < size && array[right] < array[left]) {
                min = right;
            }
            if(array[index] <= array[min]) {
                return;
            }
            int t = array[index];
            array[index] = array[min];
            array[min] = t;
            index = min;
        }
    }
}
