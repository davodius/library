package com.myBookShop.bookShop.controllers;


import com.myBookShop.bookShop.models.User;
import com.myBookShop.bookShop.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value="/api/library/user")
public class UserController {
    @Autowired
    UserService userService;


    // POST (Creating a new user).
    @PostMapping("/add")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    // GET (Getting all the users).
    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // PUT (Updating a user).
    @PutMapping("/update/{id}")
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    // GetById (Getting a user by id).
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public User getUserById(@PathVariable String id) {
        return userService.getUserById(id);
    }

    // DeleteUserById (Deleting a user).
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable String id) {
        return userService.deleteUser(id);
    }

}
