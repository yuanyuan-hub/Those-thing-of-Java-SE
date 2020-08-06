///**
// * @Author 袁媛
// * @Date 2020/8/6
// * @Time 9:25
// */
////public class Test {
//    public static void main(String[] args) {
////        try {
////
////            // do something that may cause an Exception
////
////        } catch (java.io.FileNotFoundException e) {
////
////            System.out.print("FileNotFoundException!");
////
////        } catch (java.io.IOException ex) {
////
////            System.out.print("IOException!");
////
////        } catch (java.lang.Exception ex) {
////
////            System.out.print("Exception!");
////
////        }
////
////    }
//
//
////    public void getCustomerInfo() {
////
////        try {
////
////            // do something that may cause an Exception
////
////        } catch (java.io.FileNotFoundException ex) {
////
////            System.out.print("FileNotFoundException!");
////
////        } catch (java.io.IOException ex) {
////
////            System.out.print("IOException!");
////
////        } catch (java.lang.Exception ex) {
////
////            System.out.print("Exception!");
////
////        }
////
////    }
//
////    private static void testMethod(){
////
////        System.out.println("testMethod");
////
////    }
//
////    public static void main10(String[] args) {
////
////        ((Test)null).testMethod();
////
////    }
//
//
////    public static void main9(String[] args) {
////        StringBuffer sb = new StringBuffer();
////        //字符串拼接
////        sb.append("hello").append("world");
////        fun(sb);
////        System.out.println(sb);
////    }
////    public static void fun(StringBuffer temp) {
////        temp.append("\n").append("www");
////    }
//
//    public static void main8(String[] args) {
//        String str = "helloworld";
//        //索引从0开始
//        System.out.println(str.substring(5));
//        //前闭后开，表示从第二个元素索引到第五个元素
//        System.out.println(str.substring(2,5));
//    }
//
//    public static void main6(String[] args) {
//        String str = "heu= iqh =hello world = !!!";
//        String[] result = str.split(" ");
//        for (String s : result) {
//            String[] ss = s.split("=");
//            for(String sss : ss) {
//                System.out.println(sss);
//            }
//        }
//    }
//
//    public static void main5(String[] args) {
//        String str = "hello";
//        //替换所有相同字符
//        System.out.println(str.replaceAll("l","o"));
//        //替换一个字符
//        System.out.println(str.replaceFirst("l","0"));
//    }
//
//    public static void main4(String[] args) {
//        //最好用最方便的就是contains
//        String str = "hello";
//        System.out.println(str.contains("xx"));
//
//        //使用indexOf()方法进行位置查找
//        String str2 = "helloworld";
//        System.out.println(str2.indexOf("wor"));//5,从w开始索引
//        System.out.println(str2.indexOf("bit"));//-1没有查到
//        if(str2.indexOf("hello") != -1) {
//            System.out.println("查到了！");
//        }
//
//        //判断开头或结尾
//        String str3 = "**qwdseihd123";
//        System.out.println(str3.startsWith("*"));
//        System.out.println(str3.endsWith("2"));
//    }
//
//
//
//    public static void main3(String[] args) {
//
//        String str1 = "hello";
//        String str2 = "Hello";
//        //不区分大小写比较
//        System.out.println(str1.equals(str2));
//        //区分大小写比较
//        System.out.println(str1.equalsIgnoreCase(str2));
//        //comepareTo比较，区分大小写
//        System.out.println(str1.compareTo(str2));
//
////        String str = "Hello";
////          //String转byte[]
////        byte[] data = str.getBytes();
////        for (int i = 0; i < data.length; i++) {
////            System.out.print(data[i] + " ");
////        }
////        //byte[] 转 String
////        System.out.println(new String(data));
////          char[] data = str.toCharArray();
////        for (int i = 0; i < data.length; i++) {
////            System.out.print(data[i] + " ");
////        }
////        System.out.println(str.charAt(0));
//
////          //修改1号下标以后的内容
////          str = "h" +str.substring(1);
//
////        String str1 = "hello";
////        String str2 = "he" ;
////        String str3 = str2 + "llo";
//
////        String str1 = "hello";
////        String str2 = new String("hello").intern();
////        System.out.println(str1 == str2);
//
////        int x = 10;
////        int y = 10;
////        System.out.println(x == y);
//  //  }
//
////    public static void main2(String[] args) {
////        //方式1
////        String str = "hello";
////        //方式2
////        String str2 = new String("hello");
////        //方式3
////        char[] arr = {'a','b','c'};
////        String str3 = new String(arr);
////
////    }
//
//    //实现方法 contains, 能够判定字符串中是否包含子串
//
////    public static void main(String[] args) {
////        String str1 = "helloworld";
////        String str2 = "ll";
////        System.out.println(myContains(str1, str2));
////    }
////
////    public static boolean myContains(String str1,String str2) {
////        char[] data1 = str1.toCharArray();
////        char[] data2 = str2.toCharArray();
////        for (int i = 0; i < data2.length; i++) {
////            char tmp2 = data2[i];
////            for (int j = 0; j < data1.length; j++) {
////                char tmp1 = data1[j];
////                if(tmp1 == tmp2) {
////                    if(i == data2.length - 1) {
////                        return true;
////                    }
////                    i++;
////                    tmp2 = data2[i];
////                } else {
////                    i = -1;
////                }
////            }
////        }
////        return false;
////    }
//    //实现方法 compareTo, 能够实现按照字典序比较字符串大小
//
////    public static void main2(String[] args) {
////        String str1 = "abcdef";
////        String str2 = "abcdEf";
////        System.out.println(myCompareTo(str1, str2));
////    }
////
////    public static boolean myCompareTo(String str1,String str2) {
////        int len1 = str1.length();
////        int len2 = str2.length();
////        int lim = Math.min(len1,len2);
////        char[] data1 = str1.toCharArray();
////        char[] data2 = str2.toCharArray();
////        int k = 0;
////        while (k < lim) {
////            char c1 = data1[k];
////            char c2 = data2[k];
////            if (c1 != c2) {
////               // return c1 - c2;
////            }
////            k++;
////        }
////        //return len1 - len2;
////    }
//
////    public static void main1(String[] args) {
////        String str = "abcedf";
////        String  ret =reverse(str,0,str.length() - 1);
////        System.out.println(ret);
////    }
//
////    public static String reverse(String str,int start,int end) {
////        char[] data = str.toCharArray();
////        while (start <= end) {
////            char tmp = data[start];
////            data[start] = data[end];
////            data[end] = tmp;
////            start++;
////            end--;
////        }
////        return String.copyValueOf(data);
////    }
////}