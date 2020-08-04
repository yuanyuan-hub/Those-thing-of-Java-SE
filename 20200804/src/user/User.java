package user;

import book.BookList;
import operation.IOperation;

/**
 * @Author 袁媛
 * @Date 2020/8/4
 * @Time 15:26
 */
public abstract class User {
    protected String name;
    IOperation[] iOperations;//存储当前对象所对应的所有的方法操作

    public User(String name) {
        this.name = name;
    }

    public abstract int meau();

    public void doOperation(int choice, BookList bookList ) {
        //数组下标为choice的这个对象
        this.iOperations[choice].work(bookList);
    }
}
