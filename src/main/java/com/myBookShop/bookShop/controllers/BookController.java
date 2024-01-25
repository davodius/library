package com.myBookShop.bookShop.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;

@RestController
@RequestMapping(value="/api/bookshop")
public class BookController {
    @Autowired
    Book book;
    // app app!!! Här ska det inte vara en Book, du ska ha din BookService här. Byt till nedan:
    // BookService bookService;

    // Creating a book.
    @PostMapping()
    // STOR bokstav på book, ändra till Book
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
