import book.Book;
import book.BookList;
import user.AdminUser;
import user.NormalUser;
import user.User;

import java.util.Scanner;

/**
 * @Author 袁媛
 * @Date 2020/8/4
 * @Time 15:39
 */
public class Main {

    public static User login() {
        System.out.println("请输入你的姓名");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        System.out.println("请输入你的身份（1.管理员；0.普通用户）");
        int n = scanner.nextInt();

        if (n == 1) {
            return new AdminUser(name);
        } else {
            return new NormalUser(name);
        }
    }
    public static void main(String[] args) {
        BookList bookList = new BookList();//准备书籍
        User user = login();//向上转型

        while(true) {
            int choice = user.meau();//动态绑定
            user.doOperation(choice,bookList);
        }
    }
}
