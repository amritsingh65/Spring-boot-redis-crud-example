package com.example.springboot.redis.repository;

import com.example.springboot.redis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{

    private static final String KEY = "USER";
    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public boolean save(User user) {
        try{
            redisTemplate.opsForHash().put(KEY, user.getId().toString(), user);
            return true;
        }
        catch (Exception exception){
            exception.printStackTrace();
        }
        return false;
    }

    @Override
    public List<User> fetchAllUsers() {
        List<User> users = redisTemplate.opsForHash().values(KEY);
        return users;
    }

    @Override
    public User getUserById(Long id) {
        return (User) redisTemplate.opsForHash().get(KEY,id.toString());
    }

    @Override
    public Boolean delete(Long id) {
        try{
            redisTemplate.opsForHash().delete(KEY,id.toString());
            return true;
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
