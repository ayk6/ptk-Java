package hw.orderBook;

public class Book implements Comparable<Book> {

    private final String bookName;

    private final int pageNum;

    private final String authorName;

    private final String releaseDate;

    public String getBookName() {
        return bookName;
    }

    public Book(String bookName, int pageNum, String authorName, String releaseDate) {
        this.bookName = bookName;
        this.pageNum = pageNum;
        this.authorName = authorName;
        this.releaseDate = releaseDate;
    }

    public void printBookData() {
        System.out.println(getBookName() + "\t" + getAuthorName() +
                "\t" + getPageNum() + "\t" + getReleaseDate());
    }

    @Override
    public int compareTo(Book book) {
        return getBookName().compareTo(book.getBookName());
    }

    public int getPageNum() {
        return pageNum;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

}
