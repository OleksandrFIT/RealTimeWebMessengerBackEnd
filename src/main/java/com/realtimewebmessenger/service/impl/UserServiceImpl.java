package com.realtimewebmessenger.service.impl;

import com.realtimewebmessenger.model.User;
import com.realtimewebmessenger.repository.UserRepository;
import com.realtimewebmessenger.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        User userToUpdate = userRepository.findUserByUserName(user.getUserName());
        userToUpdate.setUserName(user.getUserName());
        userToUpdate.setBio(user.getBio());
        return userRepository.save(userToUpdate);
    }
}
