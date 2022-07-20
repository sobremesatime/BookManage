package cn.jxufe.lyl.service.impl;

import cn.jxufe.lyl.domain.Book;
import cn.jxufe.lyl.mapper.BookMapper;
import cn.jxufe.lyl.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public int addBook(Book book) {
        return bookMapper.addBook(book);
    }

    @Override
    public int deleteBookById(int book_id) {
        return bookMapper.deleteBookById(book_id);
    }

    @Override
    public int updateBook(Book book) {
        return bookMapper.updateBook(book);
    }

    @Override
    public Book queryBookById(int book_id) {
        return bookMapper.queryBookById(book_id);
    }

    @Override
    public List<Book> queryAllBook() {
        return bookMapper.queryAllBook();
    }

    @Override
    public Book queryBookByName(String bookname) {
        return bookMapper.queryBookByName(bookname);
    }
}
