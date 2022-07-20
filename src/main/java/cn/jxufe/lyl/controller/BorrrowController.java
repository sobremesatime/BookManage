package cn.jxufe.lyl.controller;

import cn.jxufe.lyl.domain.Book;
import cn.jxufe.lyl.domain.Borrow;
import cn.jxufe.lyl.service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/borrow")
public class BorrrowController {
    @Autowired
    private BorrowService borrowService;

    @RequestMapping("/allBorrow")
    public String list(Model model) {
        List<Borrow> list = borrowService.queryBorrow();
        model.addAttribute("list", list);
        return "allBorrow";
    }

    @RequestMapping("/addBorrow")
    public String addBorrow(Borrow borrow) {
        borrowService.addBorrow(borrow);
        return "forward:/borrow/allBorrow";
    }

    @RequestMapping("/del/{borrow_id}")
    public String deleteBook(@PathVariable("borrow_id") int borrow_id) {
        borrowService.deleteBorrow(borrow_id);
        return "forward:/borrow/allBorrow";
    }

}
