package cn.jxufe.lyl.mapper;

import cn.jxufe.lyl.domain.Book;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookMapper {
    //增加一个Book
    int addBook(Book book);

    //根据id删除一个Book
    int deleteBookById(int book_id);

    //更新Book
    int updateBook(Book Book);

    //根据id查询,返回一个Book
    Book queryBookById(int book_id);

    //查询全部的书
    List<Book> queryAllBook();

    //通过书名查询
    Book queryBookByName(@Param("bookname") String bookname);
}
