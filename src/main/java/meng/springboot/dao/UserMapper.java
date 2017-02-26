package meng.springboot.dao;

import meng.springboot.moudle.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by mengzhang6 on 2017/1/20.
 */
@Mapper
public interface UserMapper {

    @Select("select * from user where name = #{name}")
    List<User> findUserByName(@Param("name") String name);

    @Select("select * from user")
    List<User> findAllUser();

    @Insert("INSERT INTO `user`(name,age)  VALUES (#{name},#{age})")
    void addUser( @Param("name") String name, @Param("age") int age);
}
