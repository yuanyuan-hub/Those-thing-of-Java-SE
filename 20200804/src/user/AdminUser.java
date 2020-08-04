package user;

import operation.*;

import java.util.Scanner;

/**
 * @Author 袁媛
 * @Date 2020/8/4
 * @Time 15:27
 */
public class AdminUser extends User {

    public AdminUser(String name) {
        super(name);
        this.iOperations = new IOperation[] {
                new ExitOperation(),
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new DisplayOperation()
        };
    }

    @Override
    public int meau() {
        System.out.println("=======================================");
        System.out.println("hello" + this.name + "欢迎来到图书管理系统");
        System.out.println("1.查找图书");
        System.out.println("2.新增图书");
        System.out.println("3.删除图书");
        System.out.println("4.显示图书");
        System.out.println("0.退出系统");
        System.out.println("=======================================");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        return n;

    }
}
