package com.myBookShop.bookShop.controllers;


import Payload.Request.BorrowedBookRequest;
import com.myBookShop.bookShop.models.BorrowedBook;
import com.myBookShop.bookShop.services.BorrowedBooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value="/api/library/borrowedbook")
public class BorrowedBooksController {
    @Autowired
    BorrowedBooksService borrowedBooksService;

    @PostMapping(value = "/add")
    public ResponseEntity<BorrowedBook> createBorrowedBook(@RequestBody BorrowedBookRequest borrowedBookRequest) {
        BorrowedBook newBorrowedBook = borrowedBooksService.createBorrowedbook(borrowedBookRequest);
        return ResponseEntity.ok(newBorrowedBook);
    }

    /*
    // POST (Creating a new borrowed book).
    @PostMapping("/add")
    public BorrowedBook createBorrowedBook(@RequestBody BorrowedBook borrowedBook) {
        return borrowedBooksService.createBorrowedBook(borrowedBook); // här markeras den när message = must not be null
    }
    */


    // GET (Getting all the borrowed books).
    @GetMapping("/all")
    public List<BorrowedBook> getAllBorrowedbooks() {
        return borrowedBooksService.getAllBorrowedBooks();
    }

    // PUT (Updating a borrowed book).
    @PutMapping("/update/{id}")
    public BorrowedBook updateBorrowedBook(@RequestBody BorrowedBook borrowedBook) {
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
