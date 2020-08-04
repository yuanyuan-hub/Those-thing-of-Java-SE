package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @Author 袁媛
 * @Date 2020/8/4
 * @Time 15:09
 * 删除图书
 */
public class DelOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入删除图书的名字");
        String name = scanner.next();

        int pos = -1;
        int i = 0;
        for ( i = 0; i < bookList.getUsedSize(); i++) {

            Book book = bookList.getBook(i);
            if(book.getName().equals(name)) {

                //System.out.println("找到啦！");
                pos = i;//记录下标
                break;
            }
        }
        if (i >= bookList.getUsedSize()) {
            System.out.println("没有需要删除的书");
            return;
        }
        int curSize = bookList.getUsedSize();
        for (int j = pos; j < bookList.getUsedSize() - 1; j++) {
            Book book = bookList.getBook(i+1);
            bookList.setBook(i,book);
        }
        bookList.setUsedSize(curSize - 1);
        System.out.println("删除成功!");
    }
}
