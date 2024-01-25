package com.myBookShop.bookShop.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.awt.print.Book;

public interface LibraryRepository extends MongoRepository<Book, String>{
}
