import java.util.Scanner;

/**
 * @Author 袁媛
 * @Date 2020/9/5
 * @Time 16:17
 */
public class Test {
    public static void main(String[] args) {
        //输入一行字符，统计字符串中数字个数
        //bit666keji123
        String str = "bit666keji123";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c <= '9' && c >= '0') {
                count++;
            }
        }
        System.out.println(count);
    }



    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(strToInt(str));
    }
    public static int strToInt(String str) {
        // 去掉首尾空格，并转成字符数组
        char[] chs = str.trim().toCharArray();
        // 空字符串直接返回0
        if(chs.length==0){
            return 0;
        }
        int sign = 1; // 正负号
        int res = 0;
        int i = 0;
        int boundry = Integer.MAX_VALUE / 10;
        if(chs[0] == '-'){
            sign = -1;
            i++;
        }
        if(chs[0] == '+'){
            i++;
        }
        for(int j=i; j<chs.length; j++){
            // 遇到非数字字符直接跳出
            if(chs[j] < '0' || chs[j] > '9'){
                break;
            }
            // 必须先判断是否会溢出才能做后面运算
            if(res > boundry || (res == boundry && chs[j]>'7')){
                if(sign==1){
                    return Integer.MAX_VALUE;
                }else{
                    return Integer.MIN_VALUE;
                }
            }
            res = res*10 + (chs[j]-'0');
        }
        return res*sign;
    }

    public static void main2(String[] args) {
        int[][] x = new int[3][2];
        System.out.println(x.length);
        System.out.println(x[0].length);
    }
    public static void main1(String[] args) {
        //将用户输入的字符串转化（压缩）
        //例如： "aabbccdaa" -> "a2b2c2d1a2"
        String str = "aabbccdaa";
        StringBuffer result = new StringBuffer();
        char word1 = str.charAt(0);
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char word2 = str.charAt(i);
            if(word1 == word2) {
                sum++;
                continue;
            }
            result.append(word1).append(sum);
            word1 = word2;
            sum = 1;
        }
        System.out.println(result.append(word1).append(sum));
    }
}

