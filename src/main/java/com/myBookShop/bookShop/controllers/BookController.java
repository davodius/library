package com.myBookShop.bookShop.controllers;


import com.myBookShop.bookShop.models.Book;
import com.myBookShop.bookShop.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api/library/book")
public class BookController {
    @Autowired

    BookService bookService;

    // POST (Creating a new book).
    @PostMapping("/add")
    // STOR bokstav på book, ändra till Book
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }

    // GET (Getting all the books).
    @GetMapping("/all")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    // PUT (Updating a book).
    @PutMapping("/update/{id}")
    public Book updateBook(@RequestBody Book book) {
        return bookService.updateBook(book);
    }

    // GetById (Getting book by id).
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Book getBookById(@PathVariable String id) {
        return bookService.getBookById(id);
    }

    // DeleteBookById (Deleting a book).
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public String deleteBook(@PathVariable String id) {
        return bookService.deleteBook(id);
    }

}