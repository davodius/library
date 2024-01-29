package com.myBookShop.bookShop.repository;


import com.myBookShop.bookShop.models.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LibraryRepository extends MongoRepository<Book, String> {
}
