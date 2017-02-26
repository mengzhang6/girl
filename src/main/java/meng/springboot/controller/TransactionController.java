package meng.springboot.controller;

import meng.springboot.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mengzhang6 on 2017/1/20.
 */
@RestController
public class TransactionController {

    @Autowired
    private GirlService girlService;

    @RequestMapping("/addTwo")
    public void addTwoGirl(){
        girlService.addTwoGirl();
    }
}
