import java.util.Scanner;

/**
 * @Author 袁媛
 * @Date 2020/8/5
 * @Time 15:43
 */
public class CharacterString {


    //实现方法 compareTo, 能够实现按照字典序比较字符串大小

    public static void main(String[] args) {
        String str1 = "abcdef";
        String str2 = "abcdEf";
        myCompareTo(str1,str2);
    }
    public static boolean myCompareTo(String str1,String str2) {

    }


    //实现方法 indexOf, 能够找出字符串子串存在的位置

    public static void main8(String[] args) {
        String str = "helloworld";
        String find = "llo";
        System.out.println(myIndexOf(str, find));
    }

    public static int myIndexOf(String str,String find) {
        if (str == null || str.length() < 1 || find == null || find.length() < 1) {
            return -1;
        }
        if (find.length() > str.length()) {
            return -1;
        }
        char[] strArray = str.toCharArray();
        char[] findArray = find.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            boolean isFind = false;
            if (strArray[i] == findArray[0] && (i + findArray.length <= strArray.length)) {
                int count = 0;
                for (int j = 0; j < findArray.length; j++) {
                    if(strArray[i+j] == findArray[j]) {
                        count ++;
                    }
                }
                if (count == findArray.length) {
                    isFind = true;
                }
            }
            if (isFind) {
                return i;
            }
        }
        return -1;
    }

    //实现方法 replace, 能够替换字符串中的某个部分

    public static void main7(String[] args) {
        String str = "helloworld";
        System.out.println(myReplace(str,'l','-'));
    }

    public static String myReplace(String str,char oldChar,char newChar) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if(oldChar == str.charAt(i)) {
                newStr += newChar;
            } else {
                newStr += str.charAt(i);
            }
        }
        return newStr;
    }

    public static void main6(String[] args) {
        String str = "helloworld";
        System.out.println(str.replaceAll("l","-"));
    }



    //实现方法 split, 能够指定分割符将字符串拆分成字符串数组(不必支持正则表达式)

    public static void main5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你要分割的字符串：");
        String str = scanner.nextLine();
        mySplit(str);
    }

    public static String mySplit (String str) {
        if(str.indexOf(",") != -1) {
            System.out.println(str.substring(0,str.indexOf(",")));
            return mySplit(str.substring(str.indexOf(",") + 1));
        } else {
            System.out.println(str);
            return str;
        }
    }


    public static void main4(String[] args) {
        String str = "name=zhangsan&age=18&sex=nv";
        String[] result = str.split("&") ;
        for(String s : result) {
            String[] ss = s.split("=");
            for (String sss : ss) {
                System.out.println(sss);
            }
        }
//        for (int i = 0; i < result.length; i++) {
//            System.out.println(result.length);
//            String[] temp = result[i].split("=");
//            System.out.println(temp[0] + "=" + temp[1]);
//        }
    }

    public static void main3(String[] args) {
        String str = "192.78.3";
        String[] result = str.split("\\.");
        for(String s : result) {
            System.out.println(s);
        }
    }

    public static void main2(String[] args) {
        String str = "hello world hello bit";
        String[] result = str.split(" ",3);
        for(String s : result) {
            System.out.println(s);
        }
    }

    public static void main1(String[] args) {
        String str = "hello world hello bit";
        String[] result = str.split(" ");
        for (String s : result) {
            System.out.println(s);
        }
    }
}
