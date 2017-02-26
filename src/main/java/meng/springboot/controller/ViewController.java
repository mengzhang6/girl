package meng.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by mengzhang6 on 2017/1/20.
 */
@Controller
public class ViewController {

    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public String say() {
        return "index";
    }
}
