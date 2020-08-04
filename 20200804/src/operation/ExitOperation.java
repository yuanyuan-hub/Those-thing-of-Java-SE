package operation;

import book.BookList;

/**
 * @Author 袁媛
 * @Date 2020/8/4
 * @Time 15:10
 * 退出系统
 */
public class ExitOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统");
        System.exit(0);
    }
}
