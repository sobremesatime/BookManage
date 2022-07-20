package cn.jxufe.lyl.service;

import cn.jxufe.lyl.domain.Borrow;

import java.util.List;

public interface BorrowService {
    //查询借阅信息
    List<Borrow> queryBorrow();
    //增加借阅信息
    int addBorrow(Borrow borrow);
    //删除借阅信息
    int deleteBorrow(int borrow_id);
}
