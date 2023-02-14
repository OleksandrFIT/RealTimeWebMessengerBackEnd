package com.realtimewebmessenger.service;

import com.realtimewebmessenger.model.User;

public interface UserService {

    User createUser(User user);
    User updateUser(User user);
}
