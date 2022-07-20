package cn.jxufe.lyl.domain;

public class Borrow {
    private int borrow_id;
    private String username;
    private String bookname;
    private String state;

    public Borrow() {
    }

    public Borrow(int borrow_id, String username, String bookname, String state) {
        this.borrow_id = borrow_id;
        this.username = username;
        this.bookname = bookname;
        this.state = state;
    }

    public int getBorrow_id() {
        return borrow_id;
    }

    public void setBorrow_id(int borrow_id) {
        this.borrow_id = borrow_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Borrow{" +
                "borrow_id=" + borrow_id +
                ", username='" + username + '\'' +
                ", bookname='" + bookname + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
