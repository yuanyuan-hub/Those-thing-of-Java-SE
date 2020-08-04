package operation;

import book.Book;
import book.BookList;

/**
 * @Author 袁媛
 * @Date 2020/8/4
 * @Time 15:09
 * 显示图书
 */

public class DisplayOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("显示图书");
        for (int i = 0; i < bookList.getUsedSize(); i++) {

            System.out.println(bookList.getBook(i));

        }

    }
}
