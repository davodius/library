package com.myBookShop.bookShop.repository;


import com.myBookShop.bookShop.models.BorrowedBook;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BorrowedBooksRepository extends MongoRepository<BorrowedBook, String> {
}
