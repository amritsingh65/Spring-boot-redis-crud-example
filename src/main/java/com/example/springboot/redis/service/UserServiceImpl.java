package com.example.springboot.redis.service;

import com.example.springboot.redis.model.User;
import com.example.springboot.redis.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public boolean save(User user) {
        return userDao.save(user);
    }

    @Override
    public List<User> fetchAllUsers() {
        return userDao.fetchAllUsers();
    }

    @Override
    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }

    @Override
    public Boolean delete(Long id) {
        return userDao.delete(id);
    }
}
