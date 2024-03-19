package com.myBookShop.bookShop.models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;

@Document(collection = "borrowedbooks")
public class BorrowedBook {
    @Id
    private String id;

    private Book bookId;

    @DBRef
    private User userId;

    @CreatedDate
    private Date borrowedDate;
    
    private LocalDateTime returnDate = LocalDateTime.now().plusMonths(1);

    private boolean bookReturned;

    public BorrowedBook() {
    }

    public String getId() {
        return id;
    }



    public User getBorrowedBy() {
        return userId;
    }

    public Date getBorrowedDate() {
        return borrowedDate;
    }

    public LocalDateTime getReturnDate() {

        return returnDate;
    }

    public boolean isBookReturned() {
        return bookReturned;
    }


    public void setId(String id) {
        this.id = id;
    }

    public void setBookId(Book book) {
        this.bookId = book;
    }

    public void setUserId(User user) {
        this.userId = user;
    }

    public void setBorrowedDate(Date borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    public void setReturnDate(LocalDateTime returnDate) {
        this.returnDate = returnDate;
    }

    public void setBookReturned(boolean bookReturned) {
        this.bookReturned = bookReturned;
    }

    public Book getBookId() {
        return bookId;
    }

    public User getUser() {
        return userId;
    }
}
