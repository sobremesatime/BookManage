package cn.jxufe.lyl.controller;

import cn.jxufe.lyl.domain.Admin;
import cn.jxufe.lyl.domain.Book;
import cn.jxufe.lyl.service.BookService;
import cn.jxufe.lyl.service.LoginRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;



    @RequestMapping("/allBook")
    public String list(Model model) {
        List<Book> list = bookService.queryAllBook();
        model.addAttribute("list", list);
        return "allBook";
    }


    @RequestMapping("/addBook")
    public String addPaper(Book book) {
        bookService.addBook(book);
        return "forward:/book/allBook";
    }

    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(Model model, int book_id) {
        Book book = bookService.queryBookById(book_id);
        model.addAttribute(book);
        return "updateBook";
    }

    @RequestMapping("/updateBook")
    public String updateBook(Model model, Book book) {
        System.out.println(book);
        bookService.updateBook(book);
        System.out.println(book);
        Book book1 = bookService.queryBookById(book.getBook_id());
        model.addAttribute("book", book1);
        return "forward:/book/allBook";
    }
    @RequestMapping("/del/{bookId}")
    public String deleteBook(@PathVariable("bookId") int user_id) {
        bookService.deleteBookById(user_id);
        return "forward:/book/allBook";
    }
    @RequestMapping("/queryBook")
    public String queryBook(String bookname,Model model){
        Book book = bookService.queryBookByName(bookname);
        List<Book> list= new ArrayList<Book>();
        list.add(book);
        if (book==null){
            list = bookService.queryAllBook();
            model.addAttribute("error","未查到");
        }
        model.addAttribute("list",list);
        return "allBook";
    }

    @RequestMapping("/toAdminView")
    public String toAdminView(Model model) {
        Admin admin = new Admin(1, "柳雨龙", "666888");
        model.addAttribute(admin);
        return "adminView";
    }
}
