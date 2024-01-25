package com.myBookShop.bookShop.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;

@RestController
@RequestMapping(value="/api/bookshop")
public class bookController {
    @Autowired
    Book book;

    // Creating a book.
    @PostMapping()
    public book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }

    // Getting all the books.
    @GetMapping("/all")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    // Put (Updating a book).
    @PutMapping()
    public Book updateBook(@RequestBody Book book) {
        return bookService.updateBook(book);
    }

    // Getting book by id.
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Book getBookById(@PathVariable String id) {
        return bookService.getBookById(id);
    }

    // Deleting a book.
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteBook(@PathVariable String id) {
        return bookService.deleteBook(id);
    }





}
