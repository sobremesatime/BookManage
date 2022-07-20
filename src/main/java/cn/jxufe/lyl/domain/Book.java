package cn.jxufe.lyl.domain;

public class Book {
    private int book_id;
    private String bookname;
    private String detail;

    public Book() {
    }

    public Book(int book_id, String bookname, String detail) {
        this.book_id = book_id;
        this.bookname = bookname;
        this.detail = detail;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Book{" +
                "book_id=" + book_id +
                ", bookname='" + bookname + '\'' +
                ", detail='" + detail + '\'' +
                '}';
    }
}