package com.realtimewebmessenger.controller;

import com.realtimewebmessenger.model.User;
import com.realtimewebmessenger.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/user-create")
    @ResponseStatus(HttpStatus.CREATED)
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @PutMapping("/user-update")
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }
}
