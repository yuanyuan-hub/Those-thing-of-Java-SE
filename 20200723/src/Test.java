import com.sun.xml.internal.ws.addressing.WsaActionUtil;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;


/**
 * @Author 袁媛
 * @Date 2020/7/23
 * @Time 8:36
 */

//按顺序打印数字的每一位
//public class Test {
//    public static void main(String[] args) {
//        int n = 1234;
//        print(n);
//    }
//    public static void print(int n) {
//        if (n > 9) {
//            print(n / 10);
//        }
//        System.out.print(n % 10 + " ");
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        print(arr);
//    }
//    public static void print(int[] arr) {
//        int i = 0;
//        int n = 0;
//        System.out.print("[");
//        for(i = 0;i < arr.length ;i ++) {
//            n += arr[i];
//            System.out.print(n + " ,");
//        }
//        System.out.print("]");
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        int ret = max(arr);
//        System.out.println(ret);
//    }
//    public static int max(int[] arr) {
//        int max = arr[0];
//        for (int i = 0; i < arr.length;i ++) {
//            if(arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        return max;
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        double ret = average(arr);
//        System.out.println(ret);
//    }
//    public static double average(int[] arr) {
//        int sum = 0;
//        for(int i = 0; i < arr.length;i ++) {
//            sum += arr[i];
//        }
//        return (double)sum / (double)arr.length;
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//        int[] arr = {1,5,34,56,78,90};
//        System.out.println(binarySearch(arr,51));
//    }
//    public static int binarySearch(int[] arr,int find) {
//        int left = 0;
//        int right = arr.length - 1;
//        while (left <= right) {
//            int mid = (left + right) / 2;
//            if (find < arr[mid]) {
//                right = mid - 1;
//            } else if (find > arr[mid]) {
//                left = mid + 1;
//            } else {
//                return mid;
//            }
//        }
//        return -1;
//    }
//}

//实现一个方法 toString, 把一个整型数组转换成字符串.
// 例如数组 {1, 2, 3} , 返回的字符串为 "[1, 2, 3]", 注意 逗号 的位置和数量.
//public class Test {
//    public static void main(String[] args) {
//        int[] arr = {1,2,3};
//        characterString(arr);
//    }
//    public static void characterString(int[] arr) {
//        String ret = "[";
//        for (int i = 0;i < arr.length ; i ++) {
//            ret += arr[i];
//            if (i != arr.length - 1) {
//                ret += ",";
//            }
//        }
//        ret +="]";
//        System.out.println(ret);
//    }
//}


//public class Test {
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        System.out.println(characterString(arr));
//    }
//    public static String characterString(int[] arr){
//        if (arr == null) {
//            return null;
//        }
//        if (arr.length == 0) {
//            return "[]";
//        }
//        String ret = "[";
//        for (int i = 0 ;i < arr.length;i++) {
//            if (i != arr.length - 1) {
//                ret += arr[i] + ",";
//            } else {
//                ret += arr[i] + "]";
//            }
//        }
//       return ret;
//    }
//}

//实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组.
//import java.util.Arrays;
//public class Test {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
//        int ret = Arrays.copyOf(arr, arr.length);
//        System.out.println(Arrays.toString(ret));
//    }
//    public static String Arrays.copyOf(int[] arr, int arr.length) {
//
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//        int[] array = {1,2,3,4};
//        int[] ret = Arrays.copyOf(array,array.length);
//        System.out.println(Arrays.toString(ret));
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//        int[] array = {1,2,3,4,5};
//        int[] newarr = copyOf(array);
//        System.out.println(Arrays.toString(newarr));
//    }
//    public static int[] copyOf(int[] array) {
//        int[] arr2 = new int[array.length];
//        for(int i = 0; i < array.length;i ++) {
//            arr2[i] = array[i];
//        }
//        return arr2;
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6,7,8,90,100};
//        System.out.println(binarySearch(arr,90));
//    }
//    public static int binarySearch(int[] arr,int find) {
//        int left = 0;
//        int right = arr.length - 1;
//        while (left <= right) {
//            int mid = (left + right) / 2;
//            if (arr[mid] < find) {
//                left = mid + 1;
//            } else if (arr[mid] > find) {
//                right = mid - 1;
//            } else {
//                return mid;
//            }
//        }
//        return -1;
//    }
//}

//给定一个整型数组, 判定数组是否有序（递增）
//public class Test {
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        System.out.println(isOrder(arr));
//    }
//    public static boolean isOrder(int[] arr) {
//        for (int i = 0 ; i < arr.length -1; i ++) {
//            if (arr[i] > arr[i + 1] ) {
//                return false;
//            }
//        }
//        return true;
//    }
//}

//给定一个整型数组, 实现冒泡排序(升序排序)
//public class Test {
//    public static void main(String[] args) {
//        int[] arr = {1,45,22,6,43,9,7,67};
//        sort(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//    public static void sort(int[] arr) {
//        int i = 0;
//        for( i = 0; i < arr.length ; i ++) {
//            for(int j = arr.length - 1;j > i; j --) {
//                if(arr[j - 1] > arr[j]) {
//                    int temp = arr [j - 1];
//                    arr[j - 1] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//    }
//    public static void sort(int[] arr) {
//        for (int i = 0; i < arr.length ;i ++) {
//            for (int j = 0; j < i;j ++) {
//                if (arr[j] > arr[j + 1]) {
//                    int tmp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = tmp;
//                }
//            }
//        }
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4};
//        int[] newarr = copyOf(arr);
//        System.out.println(Arrays.toString(newarr));
//    }
//    public static int[] copyOf(int[] arr) {
//        int[] arr2 = new int[arr.length];
//        for (int i = 0; i <arr.length;i ++) {
//            arr2[i] = arr [i];
//        }
//        return arr2;
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        int[] ret = Arrays.copyOf(arr,arr.length-2);
//        System.out.println(Arrays.toString(ret));
//    }
//}


//public class Test {
//    public static void main(String[] args) {
//        int[] arr = {1,2,3};
//        int[] ret = arr.clone();
//        System.out.println(Arrays.toString(ret));
//    }
//}
//    public static native void arraycopy(Object src,  int  srcPos,
//                                        Object dest, int destPos,
//                                        int length);
