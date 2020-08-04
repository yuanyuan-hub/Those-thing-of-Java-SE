package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @Author 袁媛
 * @Date 2020/8/4
 * @Time 15:11
 * 归还图书
 */
public class ReturnOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("归还图书");

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入归还图书的名字");
        String name = scanner.next();

        for (int i = 0; i < bookList.getUsedSize(); i++) {
            Book book = bookList.getBook(i);
            if (book.getName().equals(name)) {
                System.out.println("归还成功！");
                book.setBorrowed(false);
                return;
            }
        }
        System.out.println("没有这本书！");
    }
}
