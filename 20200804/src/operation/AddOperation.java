package operation;

import book.Book;
import book.BookList;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.Scanner;

/**
 * @Author 袁媛
 * @Date 2020/8/4
 * @Time 15:08
 * 添加图书
 */

public class AddOperation implements IOperation {

    @Override
    public void work(BookList bookList) {
        System.out.println("添加图书");
        //只需要放到当前顺序表的最后位置
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入添加图书的名字");
        String name = scanner.next();

        System.out.println("请输入添加图书的作者");
        String author = scanner.next();

        System.out.println("请输入添加图书的价格");
        int price = scanner.nextInt();

        System.out.println("请输入添加图书的类型");
        String type = scanner.next();

        Book book = new Book(name,author,price,type);

        int currentSize = bookList.getUsedSize();
        bookList.setBook(currentSize,book);
        bookList.setUsedSize(currentSize + 1);
        System.out.println("添加成功！");
    }
}
