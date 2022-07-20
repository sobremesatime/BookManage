package cn.jxufe.lyl.mapper;

import cn.jxufe.lyl.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    int addUser(User user);
    int deleteUser(int user_id);
    int updateUser(User user);
    User queryUserById(int user_id);
    List<User> queryAllUser();
    User queryUserByName(String username);
}
