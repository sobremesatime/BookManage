package cn.jxufe.lyl.service;

import cn.jxufe.lyl.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    //增加一个用户
    int addUser(User user);
    //根据id删除一个用户
    int deleteUser(int user_id);
    //更新用户
    int updateUser(User user);
    //根据id查询，返回一个用户
    User queryUserById(int user_id);
    //查询出所有的用户，返回list集合
    List<User> queryAllUser();
    //查询用户根据用户名
    User queryUserByName(String username);
}
