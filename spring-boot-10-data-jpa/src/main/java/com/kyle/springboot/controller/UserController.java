package com.kyle.springboot.controller;

import com.kyle.springboot.entity.User;
import com.kyle.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

/*    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id) {
        User user = userRepository.findById(id);
        return user;
    }*/

    @GetMapping("/user")
    public User insertUser(User user) {
        User save = userRepository.save(user);
        return save;
    }

}
