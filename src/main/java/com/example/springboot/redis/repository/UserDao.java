package com.example.springboot.redis.repository;

import com.example.springboot.redis.model.User;

import java.util.List;

public interface UserDao {
    boolean save(User user);

    List<User> fetchAllUsers();

    User getUserById(Long id);

    Boolean delete(Long id);
}
