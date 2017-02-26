package meng.springboot.dao;

import meng.springboot.moudle.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by mengzhang6 on 2017/1/20.
 */
public interface GirlDao extends JpaRepository<Girl,Integer> {

    /**
     * 自定义通过年龄查询
     * @param age
     * @return
     */
    public List<Girl> findGirlsByAge(Integer age);

}
