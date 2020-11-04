package com.example.springboot.redis.controller;

import com.example.springboot.redis.model.User;
import com.example.springboot.redis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public ResponseEntity<String> saveUser(@RequestBody User user) {
        boolean result = userService.save(user);
        if (result)
            return ResponseEntity.ok("User created Successfully");
        else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> fetchAllUsers() {
        List<User> users = userService.fetchAllUsers();
        return ResponseEntity.ok(users);

    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") Long id) {
        User user = userService.getUserById(id);
        return ResponseEntity.ok(user);

    }

    @DeleteMapping("/user/delete/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long id) {
        Boolean result = userService.delete(id);
        if(result)
            return ResponseEntity.ok("User deleted Successfully");
        else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();

    }
}
