package com.myBookShop.bookShop.controllers;


import com.myBookShop.bookShop.models.BorrowedBook;
import com.myBookShop.bookShop.models.User;
import com.myBookShop.bookShop.services.BorrowedBooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value="/api/library/borrowedbook")
public class BorrowedBooksController {
    @Autowired
    BorrowedBooksService borrowedBooksService;

    // POST (Creating a new borrowed book).
    @PostMapping("/add")
    public BorrowedBook createBorrowedBook(@RequestBody BorrowedBook borrowedBook) {
        return borrowedBooksService.createBorrowedBook(borrowedBook);
    }

    // GET (Getting all the borrowed books).
    @GetMapping("/all")
    public List<User> getAllBorrowedbooks() {
        return borrowedBooksService.getAllBorrowedBooks();
    }

    // PUT (Updating a borrowed book).
    @PutMapping("/update/{id}")
    public User updateBorrowedBook(@RequestBody BorrowedBook borrowedBook) {
        return borrowedBooksService.updateBorrowedBook(borrowedBook);
    }

    // Get by id (Getting a loan by id).
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public BorrowedBook getBorrowedBookById(@PathVariable String id) {
        return borrowedBooksService.getBorrowedBookById(id);
    }

    // Delete borrowed book by id (Deleting a borrowed book).
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public String deleteBorrowedBook(@PathVariable String id) {
        return borrowedBooksService.deleteBorrowedBook(id);
    }

}
