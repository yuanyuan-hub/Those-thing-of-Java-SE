import java.util.Arrays;

/**
 * @Author 袁媛
 * @Date 2020/9/4
 * @Time 10:11
 */
 class Test {

        public Test() {
            System.out.println("HelloA");
        } {
            System.out.println("i am A class");
        }
        static {
            System.out.println("static A");
        }
    }
    public class TestClass extends Test{
        public TestClass() {
            System.out.println("TestClass");
        } {
            System.out.println("i am TestClass");
        }
        static {
            System.out.println("static TestClass");
        }
        public static void main(String[] args) {
            new TestClass();
        }
 }

    //将一个数组从左开始前k个字符进行旋转：左旋数组
    //如：将"abcdef"当k等于2时，进行旋转，得到结果为："cdefab"
//    public static void main(String[] args) {
//        leftRotateString("abcdef",2);
//    }
//    public static void leftRotateString(String str,int n) {
//        char[] arr = str.toCharArray();
//        char[] arr1 = new char[arr.length];
//        int i = 0;
//        for (int j = n; j < arr.length; j++) {
//            arr1[i] = arr[j];
//            i++;
//        }
//        for (int j = 0; j < n; j++) {
//            arr1[i] = arr[j];
//            i++;
//        }
//        String str1 = new String(arr1);
//        System.out.println(str1);
//    }


    //一个整型数组里除了两个数字之外，其他的数字都出现了两次。
    // 请写程序找出这两个只出现一次的数字。
    //例如:数组为{1，3，5，7，1，3，5，9}，找出7和9。
//    public static void main(String[] args) {
//        int[] arr = {1,3,5,7,1,3,5,9};
//        int[] num1 = 0;
//        int[] num2 = 0;
//        System.out.println(findNum(arr,num1,num2));
//    }
//    public static int[] findNum(int[] arr,int[] num1,int[] num2) {
//            int length = arr.length;
//            if(length == 2){
//                num1[0] = arr[0];
//                num2[0] = arr[1];
//                return arr;
//            }
//            int bitResult = 0;
//            for(int i = 0; i < length; ++i){
//                bitResult ^= arr[i];
//            }
//            int index = findFirst1(bitResult);
//            for(int i = 0; i < length; ++i){
//                if(isBit1(array[i], index)){
//                    num1[0] ^= array[i];
//                }else{
//                    num2[0] ^= array[i];
//                }
//            }
//        }
//
//        private int findFirst1(int bitResult){
//            int index = 0;
//            while(((bitResult & 1) == 0) && index < 32){
//                bitResult >>= 1;
//                index++;
//            }
//            return index;
//        }
//
//        private boolean isBit1(int target, int index){
//            return ((target >> index) & 1) == 1;
//        }
//    }


    public static void main3(String[] args) {

    }
    public static void print(){
        System.out.println("MTDP");
    }
    public static void main2(String[] args) {
        try{
            //((Test)null).print();
        }catch(NullPointerException e){
            System.out.println("NullPointerException");
        }
    }
    public static void main1(String[] args) {
        //例如输入的数组为{1,-2,3,10,-4,7,2,-5}，
        //和最大的子数组为{3,10,-4,7,2}，因此输出为该子数组的和18。
        int[] arr = {1,-2,3,10,-4,7,2,-5};
        System.out.println(findGreatestSum(arr));
    }
    public static int findGreatestSum(int[] arr) {
        int geratSum = 0;
        int geneSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(geneSum < 0 ) {
                geneSum = arr[i];
            } else {
                geneSum += arr[i];
            }
            if(geneSum > geratSum)
                geratSum = geneSum;
        }
        return geratSum;
    }
}
