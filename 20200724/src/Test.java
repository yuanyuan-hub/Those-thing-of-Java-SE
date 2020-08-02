//import java.util.Arrays;
//
///**
// * @Author 袁媛
// * @Date 2020/7/24
// * @Time 8:43
// */
//
//
//public class Test{
//
//    private float f=1.0f;
//
//    int m=12;
//
//    static int n=1;
//
//    public static void main(String args[]){
//
//        Test t=new Test();
//        //t.f = 1.0;
//        //this.n;
//        //Test.;
//        Test.n;
//    }
//
//}
////public class Test{
////    static boolean Paddy;
////    public static void main(String args[]){
////        System.out.println(Paddy);
////    }
////}
////public class Test {
////    public int aMethod(){
////        static int i = 0;
////        i++;
////        return i;
////    }
////    public static void main(String args[]){
////        Test test = new Test();
////        test.aMethod();
////        int j = test.aMethod();
////        System.out.println(j);
////    }
////}
////阅读如下代码。 请问，对语句行 test.hello(). 描述正确的有（）
//
////package NowCoder;
//
////public class Test{
//
//
////public static void main(String[] args) {
////
////    String s;
////
////    System.out.println("s=" + s);
////}
////}
////class East {
////    public static void hello() {
////        System.out.println("hello");
////    }
////}
////public class Test {
////    public static void main(String[] args) {
////        // TODO Auto-generated method stub
////        East test=null;
////        test.hello();
////    }
////}
//
////public class Test {
////    public static void main(String[] args) {
////        int[] arr = {1,2,3,4,5};
////        isInversion(arr);
////        System.out.println(Arrays.toString(arr));
////    }
////    public static void isInversion(int[] arr) {
////        int left = 0;
////        int right = arr.length - 1;
////        while (left <right) {
////            int tmp = arr[left];
////            arr[left] = arr[right];
////            arr[right] = tmp;
////            left ++;
////            right --;
////        }
////    }
////}
//
////冒泡排序法
////public class Test {
////    public static void main(String[] args) {
////        int[] arr = {23,45,2,12,4,8,56};
////        isBubbling(arr);
////        System.out.println(Arrays.toString(arr));
////    }
////    public static void isBubbling(int[] arr) {
////        boolean flag = false;
////        for(int i = 0; i < arr.length - 1;i ++) {
////            flag = false;
////            for (int j = 0 ;j < arr.length - 1 - i;j++) {
////                if (arr[j] > arr[j + 1]) {
////                    int tmp = arr[j];
////                    arr[j] = arr[j+1];
////                    arr[j+1] = tmp;
////                    flag = true;
////                }
////            }
////            if (flag == false) {
////                break;
////            }
////        }
////    }
////}
//
//
////public class Test {
////    public static void main(String[] args) {
////        int[] arr = {1,2,3,4,3,6,7};
////        System.out.println(isSorted(arr));
////    }
////    public static boolean isSorted(int[] arr) {
////        if(arr == null || arr.length == 0) {
////            return false;
////        }
////        for(int i = 0; i < arr.length - 1; i ++) {
////            if (arr[i] > arr [i+1]) {
////                return false;
////            }
////        }
////        return true;
////    }
////}
//
////public class Test {
////    public static void main(String[] args) {
////        int[] arr = {2,5,23,9,23};
////        isPart(arr);
////        System.out.println(Arrays.toString(arr));
////    }
////    public static void isPart(int[] arr) {
////        for(int i = 0; i < arr.length - 1 ;i++) {
////            for (int j = 0;j < arr.length - i - 1 ; j ++) {
////                if (arr[j] > arr [j+1]) {
////                    int tmp = arr[j] ;
////                    arr[j] = arr[j + 1];
////                    arr[j + 1] = tmp;
////                }
////            }
////        }
////    }
////}
////
////
////public class Test {
////    public static
////}