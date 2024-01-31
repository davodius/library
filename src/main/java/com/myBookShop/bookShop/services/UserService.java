package com.myBookShop.bookShop.services;


import com.myBookShop.bookShop.models.User;
import com.myBookShop.bookShop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    // Creating a user
    public User createUser(User user) {
        return userRepository.save(user);
    }

    // Getting all users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Updating a user
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    // Getting a specific user by id
    public User getUserById(String id) {
        return userRepository.findById(id).get();
    }

    // Delete a specific user by using id
    public String deleteUser(String id) {
        userRepository.deleteById(id);
        return "User has been terminated";
    }

}
