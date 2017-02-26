package meng.springboot.controller;

import meng.springboot.dao.UserMapper;
import meng.springboot.moudle.User;
import meng.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by mengzhang6 on 2017/1/20.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;

    @GetMapping("/findByName/{name}")
    public List<User> findUserByName(@PathVariable("name") String name) {
        return userMapper.findUserByName(name);
    }

    @RequestMapping("/findAllUser")
    public List<User> findAllUser() {
        return userService.findAllUser();
    }

    @PostMapping("/addUser")
    public User addUser(@RequestParam("name") String name,@RequestParam("age") int age){
        User user = new User();
        user.setName(name);
        user.setAge(age);
        return userService.addUser(user);
    }
}
