package meng.springboot.service.impl;

import meng.springboot.dao.UserMapper;
import meng.springboot.moudle.User;
import meng.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mengzhang6 on 2017/1/20.
 */
@Service
public class UserServiceMysqlImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAllUser() {
        return userMapper.findAllUser();
    }

    @Override
    public User addUser(User user) {
        userMapper.addUser(user.getName(),user.getAge());
        return user;
    }
}
