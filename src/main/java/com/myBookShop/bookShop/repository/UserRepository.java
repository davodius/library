package com.myBookShop.bookShop.repository;


import com.myBookShop.bookShop.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
