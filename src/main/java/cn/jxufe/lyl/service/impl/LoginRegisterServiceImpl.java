package cn.jxufe.lyl.service.impl;

import cn.jxufe.lyl.domain.Admin;
import cn.jxufe.lyl.domain.User;
import cn.jxufe.lyl.mapper.AdminMapper;
import cn.jxufe.lyl.mapper.UserMapper;
import cn.jxufe.lyl.service.LoginRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class LoginRegisterServiceImpl implements LoginRegisterService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private AdminMapper adminMapper;


    @Override
    public User login(User user) throws SQLException {
        User user1 = userMapper.queryUserByName(user.getUsername());
        if(user1!=null && user1.getPassword().equals(user.getPassword())){
            return user1;
        }
        return null;
    }

    @Override
    public Admin adminLogin(Admin admin) throws SQLException {
        Admin admin1 = adminMapper.adminLogin(admin.getAdminname());
        if(admin1!=null && admin1.getPassword().equals(admin.getPassword()))
            return admin1;
        return null;
    }


    @Override
    public boolean register(User user) throws SQLException {
        if (user != null) {
            userMapper.addUser(user);
            return true;
        }else
            return false;
    }
}
