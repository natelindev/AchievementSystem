package com.achievement_system.core.service.impl;


import com.achievement_system.core.mapper.UserMapper;
import com.achievement_system.core.service.UserService;
import com.achievement_system.core.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("UserService")
public class UserServiceImpl implements UserService {
    @Resource(name = "UserMapper")
    private UserMapper userMapper;

    public List<User> selectAll() {
            return userMapper.selectAll();
        }
    public void insertUser(User user){
            userMapper.insertUser(user);
        }
    public void updateUser(User user){
            userMapper.updateUser(user);
        }
    public void deleteUser(User user){
            userMapper.deleteUser(user);
        }
}

