package com.myBookShop.bookShop.services;


import Payload.Request.BorrowedBookRequest;
import com.myBookShop.bookShop.models.Book;
import com.myBookShop.bookShop.models.BorrowedBook;
import com.myBookShop.bookShop.models.User;
import com.myBookShop.bookShop.repository.BorrowedBooksRepository;
import com.myBookShop.bookShop.repository.LibraryRepository;
import com.myBookShop.bookShop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowedBooksService {
    @Autowired
    BorrowedBooksRepository borrowedBooksRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    LibraryRepository libraryRepository;


    public BorrowedBook createBorrowedbook(BorrowedBookRequest borrowedBookRequest){
        User user = userRepository.findById(borrowedBookRequest.getUserId())
        .orElseThrow(()->new IllegalArgumentException("That user does not exist. "));

        Book book = libraryRepository.findById(borrowedBookRequest.getBookId())
                .orElseThrow(()->new IllegalArgumentException("That user does not exist. "));

        BorrowedBook newBorrowedBook = new BorrowedBook();
        newBorrowedBook.setUserId(user);
        newBorrowedBook.setBookId(book);
        return borrowedBooksRepository.save(newBorrowedBook);





    }
















/*
    // order complex dto
    // Creating a borrowed book
    public BorrowedBook createBorrowedBook(BorrowedBookRequest borrowedBook) {
            //borrowedBook.calculateReturnDate(borrowedBook.getBorrowedDate());   // här markeras den när message = must not be null
        return borrowedBooksRepository.save(borrowedBook);
    }
*/

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
