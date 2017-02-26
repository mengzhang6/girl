package meng.springboot.service;

import meng.springboot.dao.GirlDao;
import meng.springboot.moudle.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by mengzhang6 on 2017/1/20.
 */
@Service
public class GirlService {

    @Autowired
    private GirlDao girlDao;

    /**
     * 要求要么同时添加，要么同时不添加
     */
    @Transactional
    public  void addTwoGirl(){
        Girl girlA = new Girl();
        girlA.setCupSize("F");
        girlA.setAge(20);
        girlDao.save(girlA);

        Girl girlB = new Girl();
        girlB.setCupSize("DDDD");
        girlB.setAge(17);
        girlDao.save(girlB);

    }
}
