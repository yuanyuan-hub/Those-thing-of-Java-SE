package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @Author 袁媛
 * @Date 2020/8/4
 * @Time 15:11
 * 查找图书
 */
public class FindOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("查找图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入查找的书名");
        String name = scanner.next();
        for (int i = 0; i < bookList.getUsedSize(); i++) {

            Book book = bookList.getBook(i);
            if(book.getName().equals(name)) {

                System.out.println("找到啦！");

                System.out.println(book);
                return;
            }
        }
        System.out.println("没有这本书！");
    }
}
