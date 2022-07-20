package cn.jxufe.lyl.service.impl;

import cn.jxufe.lyl.domain.Borrow;
import cn.jxufe.lyl.mapper.BorrowMapper;
import cn.jxufe.lyl.service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowServiceImpl implements BorrowService {

    @Autowired
    private BorrowMapper borrowMapper;

    @Override
    public List<Borrow> queryBorrow() {
        return borrowMapper.queryBorrow();
    }

    @Override
    public int addBorrow(Borrow borrow) {
        return borrowMapper.addBorrow(borrow);
    }

    @Override
    public int deleteBorrow(int borrow_id) {
        return borrowMapper.deleteBorrow(borrow_id);
    }
}
