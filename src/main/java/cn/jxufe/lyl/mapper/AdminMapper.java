package cn.jxufe.lyl.mapper;

import cn.jxufe.lyl.domain.Admin;
import cn.jxufe.lyl.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminMapper {
    //管理员登录
    Admin adminLogin(String adminname);
}
