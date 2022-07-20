package cn.jxufe.lyl.service;

import cn.jxufe.lyl.domain.Admin;
import cn.jxufe.lyl.domain.User;

import java.sql.SQLException;

public interface LoginRegisterService {
    public User login(User user) throws SQLException;
    public Admin adminLogin(Admin admin) throws SQLException;
    public boolean register(User user) throws SQLException;
}
