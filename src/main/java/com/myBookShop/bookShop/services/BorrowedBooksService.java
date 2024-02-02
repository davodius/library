package com.myBookShop.bookShop.services;


import com.myBookShop.bookShop.models.BorrowedBook;
import com.myBookShop.bookShop.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowedBooksService {
    @Autowired
    // Creating a Loan
    public BorrowedBooks createBorrowedBook(BorrowedBook borrowedBook) {
        return borrowedBooksRepository.save(borrowedBook);
    }

    // Getting all loans
    public List<User> getAllBorrowedBooks() {
        return borrowedBooksRepository.findAll();
    }

    // Updating a loan
    public User updateBorrowedBook(BorrowedBook borrowedBook) {
        return borrowedBooksRepository.save(borrowedBook);
    }

    // Getting a specific loan by id
    public Loan getBorrowedBookById(String id) {
        return borrowedBooksRepository.findById(id).get();
    }

    // Delete a specific loan by using id
    public String deleteBorrowedBook(String id) {
        borrowedBooksRepository.deleteById(id);
        return "Loan has been terminated";
    }

}
