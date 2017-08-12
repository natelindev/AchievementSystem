package com.achievement_system.core.mapper;

import com.achievement_system.core.model.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("UserMapper")
public interface UserMapper {
    @Select("select * from users")
    @Results(value = {@Result(id = true, property = "userId", column = "USER_ID"),
            @Result(property = "userName", column = "USER_NAME"),
            @Result(property = "userPassword",column = "USER_PASSWORD")
    })
    public List<User> selectAll();

    @Insert("insert into users(USER_NAME,USER_PASSWORD) values(#{userName},#{userPassword})")
    public void insertUser(User user);

    @Update("update users set USER_PASSWORD = #{userPassword} where USER_NAME = #{userName}")
    public void updateUser(User user);

    @Delete("delete from users where USER_NAME = #{userName}")
    public void deleteUser(User user);

}

