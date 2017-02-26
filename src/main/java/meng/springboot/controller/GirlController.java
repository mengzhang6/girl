package meng.springboot.controller;

import meng.springboot.dao.GirlDao;
import meng.springboot.moudle.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by mengzhang6 on 2017/1/20.
 */
@RestController
public class GirlController {

    @Autowired
    private GirlDao girlDao;

    @GetMapping("/girls")
    public List<Girl> getGirlList() {
        return girlDao.findAll();
    }

    @PostMapping("/girls")
    public Girl AddGirl(@RequestParam("cupSize") String cupSize,
                        @RequestParam("age") Integer age) {
        Girl girl = new Girl();
        girl.setCupSize(cupSize);
        girl.setAge(age);
        return girlDao.save(girl);
    }

    @GetMapping("/girls/{id}")
    public Girl getGirlById(@PathVariable("id") Integer id) {
        return girlDao.findOne(id);
    }

    @PutMapping("/girls")
    public Girl updateGirl(@RequestParam("id") Integer id,
                           @RequestParam("cupSize") String cupSize,
                           @RequestParam("age") Integer age) {
        Girl girl = girlDao.findOne(id);
        girl.setAge(age);
        girl.setCupSize(cupSize);
        return girlDao.save(girl);
    }

    @DeleteMapping("/girls/{id}")
    public void deleteGirl(@PathVariable("id") Integer id) {
        girlDao.delete(id);
    }

    @GetMapping("/girls/age")
    public List<Girl> getGirlsByAge(@RequestParam("age") Integer age) {
        return girlDao.findGirlsByAge(age);
    }

}
