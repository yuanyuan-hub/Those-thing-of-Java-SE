import java.util.Random;
import java.util.Scanner;

/**
 * @Author 袁媛
 * @Date 2020/8/5
 * @Time 8:35
 */
public class Practice {


    public static void main16(String[] args) {
        String str = "helloworld";
        System.out.println(str.substring(5));
        System.out.println(str.substring(0,5));
    }

    public static void main15(String[] args) {
        String s1="abc"+"def";//1
        String s2=new String(s1);//2
        if(s1.equals(s2))//3
            System.out.println(".equals succeeded");//4
        if(s1==s2)//5
            System.out.println("==succeeded");//6

    }


    public static boolean isAdmin(String userId){
        String ret = userId.toLowerCase();
        System.out.println(ret);
        return userId.toLowerCase()=="admin";

    }
    public static void main14(String[] args){
        System.out.println(isAdmin("Admin"));
    }


    String str = new String("good");
    char[ ] ch = { 'a' , 'b' , 'c' };
    public static void main13(String args[]){
        Practice ex = new Practice();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str + " and ");
        System.out.print(ex.ch);
    }
    public void change(String str,char ch[ ]){
        str = "test ok";
        ch[0] = 'g';
    }

    public static void main12(String[] args) {
        String str = "123o5";
        System.out.println(isNumber(str));
    }
    public static boolean isNumber(String str) {
        char[] data = str.toCharArray();
        for (int i = 0; i < data.length; i++) {
            if (data[i] > '9' || data[i] < '0' ) {
                return false;
            }
        }
        return true;
    }

    public static void main10(String[] args) {
        short a =128;

        byte b =(byte) a;
        System.out.println(a + " " + b);
    }

    public static void main11(String[] args) {
        int n = 1;
        double sum = 0;
        for (int i = 1; i <= 100; i++) {
           // fac = fac * (-1);
            if (i % 2 == 0) {
                sum = sum - 1.0 / i;
            } else {
                sum = sum + 1.0 / i;
            }
        }
        System.out.println(sum);
    }

    //乘法口诀表
    public static void main9(String[] args) {
        for (int i = 1; i < 9 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(i + " * " + j + "=" + i*j + "   ");
                if (i == j) {
                    System.out.println();
                }
            }
        }
    }

    //猜数字游戏
    public static void main8(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int toGuess = random.nextInt(100) + 1;
        while (true) {
            System.out.print("请输入你猜测的数字：");
            int num = sc.nextInt();
            if (num < toGuess) {
                System.out.println("猜小啦！");
            } else if (num > toGuess) {
                System.out.println("猜大啦！");
            } else {
                System.out.println("猜对啦");
                break;
            }
        }
    }

    public static void main7(String[] args) {
        int sum = 0;
        int num = 1;
        while(num <=5) {
            int fac = 1;
            int tmp = 1;
            while(tmp <= num) {
                fac *= tmp;
                tmp++;
            }
            sum += fac;
            num++;
        }
        System.out.println("sum = " +sum);
    }

    public static void main6(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入1-7之间的一个数字：");
        int num = scanner.nextInt();
        switch (num) {
            case 1:{
                System.out.println("周一");
                break;
            }
            case 2:{
                System.out.println("周二");
                break;
            }case 3:{
                System.out.println("周三");
                break;
            }case 4:{
                System.out.println("周四");
                break;
            }case 5:{
                System.out.println("周五");
                break;
            }case 6:{
                System.out.println("周六");
                break;
            }case 7:{
                System.out.println("周日");
                break;
            }
            default:
                System.out.println("输入有误");
                break;
        }
    }

    public static void main5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要判断的数字");
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println("偶数");
        } else {
            System.out.println("基数");
        }

    }

    public static void main4(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = (byte)(a + b);
        System.out.println(c);
    }
    public static void main3(String[] args) {
        int a = 10;
        double b = 1.0;
        //a = b;
        b = a;
    }
    public static void main2(String[] args) {
        final int x = 10;
        //x = 20;
        System.out.println(x);
    }
    public static void main1(String[] args) {
        int num = 10;
        System.out.println(num);
    }
}
