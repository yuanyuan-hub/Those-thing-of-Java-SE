package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @Author 袁媛
 * @Date 2020/8/4
 * @Time 15:08
 * 借阅图书
 */
public class BorrewOperation implements IOperation{

    @Override
    public void work(BookList bookList) {
        System.out.println("借阅图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入借阅图书的名字");
        String name = scanner.next();
        for (int i = 0; i < bookList.getUsedSize(); i++) {

            Book book = bookList.getBook(i);
            if (book.getName().equals(name)) {
                System.out.println("借阅成功！");
                book.setBorrowed(true);
                return;
            }
        }
    }
}
