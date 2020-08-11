import java.util.Scanner;

/**
 * @Author 袁媛
 * @Date 2020/8/11
 * @Time 21:58
 */
public class Test {

    //在一个二维数组中，每一行都按照从左到右递增的顺序排序，
    // 每一列都按照从上到下递增的顺序排序。请完成一个函数，
    // 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。

    public static void main(String[] args) {
        System.out.println("请输入你的数组层数");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("行和列都按照递增的顺序输入元素");
        int j = 0;
        int k = 0;
        for (j = 0; j < n; j++) {
            for (k = 0; k < n; k++) {
                arr[j][k] = scanner.nextInt();
            }
        }
        System.out.println("请输入你要查找的整数");
        int x = scanner.nextInt();
        System.out.println(find(x,arr));
    }

    public static boolean find(int x,int[][] arr) {
        int row = 0;
        int col = arr[0].length -1;
        while(row <= arr.length - 1 && col >= 0) {
            if(x > arr[row][col]) {
                row ++;
            } else if (x < arr[row][col]) {
                col--;
            } else {
                return true;
            }
        }
        return false;
    }



    private static int i = 1;
    public int getNext(){
        return i++;
    }
    public static void main2(String [] args){
        Test test=new Test();
        Test testObject=new Test();
        test.getNext();
        testObject.getNext();
        System.out.println(testObject.getNext());
    }
    public static void main1(String[] args) {
        //int i = 15;
        int i = 2;
        int j = i ++ * 3;
        System.out.println(j);
    }
}
