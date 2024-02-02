package com.myBookShop.bookShop.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BorrowedBooksRepository extends MongoRepository<Loan, String> {
}
