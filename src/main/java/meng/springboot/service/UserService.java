package meng.springboot.service;

import meng.springboot.moudle.User;

import java.util.List;

/**
 * Created by mengzhang6 on 2017/1/20.
 */
public interface UserService {

    List<User> findAllUser();

    User addUser(User user);
}
