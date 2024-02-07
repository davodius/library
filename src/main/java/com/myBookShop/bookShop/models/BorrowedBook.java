package com.myBookShop.bookShop.models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Calendar;
import java.util.Date;

@Document(collection = "borrowedbooks")
public class BorrowedBook {
    @Id
    private String id;

    private String title;

    private String borrowedBy;

    @CreatedDate
    private Date borrowedDate;

    private Date returnDate;

    // Constructor for returndate function
    /*public BorrowedBook(Date borrowedDate, Date returnDate) {
        this.borrowedDate = borrowedDate;
        this.returnDate = calculateReturnDate(borrowedDate);
    }*/

    // dina fält för lånat datum och returnerat datum
    // metod för att räkna ut retur datum
    public Date calculateReturnDate(Date borrowedDate) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("rad 1" + calendar);
        calendar.setTime(borrowedDate);
        System.out.println("rad 2" + calendar);
        // sätter calendar objektet till samma datum som borrowedDate
        calendar.add(Calendar.DAY_OF_MONTH, 30);
        System.out.println("rad 3" + calendar);
        // lägger till 30 dagar på borrowedDate datumet
        return calendar.getTime();
        // returnerar datumet (borrowedDate + 30)
    }

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

    public Date getBorrowedDate() {
        return borrowedDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public boolean isBookReturned() {
        return bookReturned;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
}
