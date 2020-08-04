package book;

/**
 * @Author 袁媛
 * @Date 2020/8/4
 * @Time 14:58
 */
public class BookList {

    private Book[] books = new Book[10];
    private int usedSize;

    public BookList() {
        books[0] = new Book("三国","罗贯中",12,"小说");
        books[1] = new Book("西游记","吴承恩",22,"小说");
        books[2] = new Book("水浒传","施耐庵",18,"小说");
        this.usedSize = 3;
    }

    public void setBook(int pos,Book book) {

        this.books[pos] = book;
    }

    public Book getBook(int pos) {

        return this.books[pos];
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }
}
