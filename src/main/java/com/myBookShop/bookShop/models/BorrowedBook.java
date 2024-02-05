package com.myBookShop.bookShop.models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "borrowedbooks")
public class BorrowedBook {
    @Id
    private String id;

    private String title;

    private String borrowedBy;

    @CreatedDate
    private String borrowedDate;

    private String returnDate;

    private boolean bookReturned;

    public BorrowedBook() {
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBorrowedBy() {
        return borrowedBy;
    }

    public String getBorrowedDate() {
        return borrowedDate;
    }

    public BorrowedBook borrowedDate(Book book) {
        book.borrowedDate(new borrowedDate());
        return private Date borrowedDate;
    }


    public String getReturnDate() {
        return returnDate;
    }

    public boolean isBookReturned() {
        return bookReturned;
    }

}
