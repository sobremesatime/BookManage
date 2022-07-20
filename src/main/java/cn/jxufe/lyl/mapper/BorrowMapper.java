package cn.jxufe.lyl.mapper;

import cn.jxufe.lyl.domain.Borrow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BorrowMapper {
    //查询所有借阅信息
    List<Borrow> queryBorrow();
    //借书
    int addBorrow(Borrow borrow);
    //还书
    int deleteBorrow(int borrow_id);
}
