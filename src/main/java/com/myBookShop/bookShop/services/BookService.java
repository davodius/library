package com.myBookShop.bookShop.services;

import com.myBookShop.bookShop.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;

@Service
public class BookService {
    @Autowired
    LibraryRepository libraryRepository;

    // Creating a book
    public Book createBook(Book book) {
        return libraryRepository.save(book);
    }

    // Getting all books
    public List<Book> getAllBooks() {
        return libraryRepository.findAll();
    }

    // Updating a book
    public Book updateBook(Book book) {
        return libraryRepository.save(book);
    }

    // Getting a specific book by id
    public Book getBookById(String id) {
        return libraryRepository.findById(id).get();
    }

    // Delete a specific book by using id
    public String deleteBook(String id) {
        libraryRepository.deleteById(id);
        return "Book has been terminated";
    }

}
