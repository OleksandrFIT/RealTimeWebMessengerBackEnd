package com.realtimewebmessenger.repository;

import com.realtimewebmessenger.model.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {

    User findUserByUserName(String userName);
}
