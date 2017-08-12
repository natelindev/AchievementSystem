package com.achievement_system.core.service;

import com.achievement_system.core.model.User;

import java.util.List;

public interface UserService {
    public List<User> selectAll();
    public void insertUser(User user);
    public void updateUser(User user);
    public void deleteUser(User user);
}

