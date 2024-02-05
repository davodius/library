package com.myBookShop.bookShop.services;


import com.myBookShop.bookShop.models.BorrowedBook;
import com.myBookShop.bookShop.repository.BorrowedBooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowedBooksService {
    @Autowired
    BorrowedBooksRepository borrowedBooksRepository;

    // Creating a borrowed book
    public BorrowedBook createBorrowedBook(BorrowedBook borrowedBook) {
        return borrowedBooksRepository.save(borrowedBook);
    }

    // Getting all borrowed books
    public List<BorrowedBook> getAllBorrowedBooks() {
        return borrowedBooksRepository.findAll();
    }

    // Updating a borrowed book
    public BorrowedBook updateBorrowedBook(BorrowedBook borrowedBook) {
        return borrowedBooksRepository.save(borrowedBook);
    }

    // Getting a specific borrowed book by id
    public BorrowedBook getBorrowedBookById(String id) {
        return borrowedBooksRepository.findById(id).get();
    }

    // Delete a specific borrowed book by using id
    public String deleteBorrowedBook(String id) {
        borrowedBooksRepository.deleteById(id);
        return "The borrowed book has been returned";
    }

}
