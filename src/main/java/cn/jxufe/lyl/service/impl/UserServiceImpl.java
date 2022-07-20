package cn.jxufe.lyl.service.impl;

import cn.jxufe.lyl.domain.User;
import cn.jxufe.lyl.mapper.UserMapper;
import cn.jxufe.lyl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public int deleteUser(int user_id) {
        return userMapper.deleteUser(user_id);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public User queryUserById(int user_id) {
        return userMapper.queryUserById(user_id);
    }


    @Override
    public List<User> queryAllUser() {
        return userMapper.queryAllUser();
    }

    @Override
    public User queryUserByName(String username) {
        return userMapper.queryUserByName(username);
    }
}
