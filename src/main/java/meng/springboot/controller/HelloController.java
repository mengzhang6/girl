package meng.springboot.controller;

import meng.springboot.moudle.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * Created by mengzhang6 on 2017/1/20.
 *
 * @RestController 相当于 @RequestMappin 和 @ResponseBody 的集合
 */
//@RequestMapping("/boot")
//@ResponseBody
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Value("${name}")
    private String name;

    @Value("${age}")
    private Integer age;

    @Value("${content}")
    private String content;

    @Autowired
    private GirlProperties girlProperties;

    @GetMapping("/pro")
    public String properties() {
        return girlProperties.getCupSize();
    }

    @RequestMapping(value = {"/hi", "/hello"}, method = {RequestMethod.GET, RequestMethod.POST})
    public String hello() {
        return "hello Spring boot <br>";
    }

    @RequestMapping(value = "/say", method = {RequestMethod.GET, RequestMethod.POST})
    public String say(@RequestParam(value = "name", required = false, defaultValue = "0") String name) {
        return name;
    }

    @RequestMapping(value = "/value", method = RequestMethod.GET)
    public String getContent() {
        String value = "";
        value += name;
        value += "<br>";
        value += age;
        value += "<br>";
        value += content;
        return "" + value;
    }

    /**
     * @GetMapping 相当于 @RequestMapping(method = RequestMethod.GET)
     */
    @GetMapping(value = "/getDemo/{userName}")
//    @RequestMapping(value = "/getDemo/{userName}", method = RequestMethod.GET)
    public String getDemo(@PathVariable String userName) {
        return "测试GET请求：" + userName;
    }

    @PostMapping("/postDemo/{userName}")
//    @RequestMapping(value = "/postDemo/{userName}", method = RequestMethod.POST)
    public String postDemo(@RequestParam String userName) {
        return "测试POST请求：" + userName;
    }

}