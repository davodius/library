package com.myBookShop.bookShop.models;

public class Loan {
    private String id;

    private String title;

    private String loanedBy;

    private String loanDate;

    private String returnDate;

    private boolean bookReturned;

    public Loan() {
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getLoanedBy() {
        return loanedBy;
    }

    public String getLoanDate() {
        return loanDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public boolean isBookReturned() {
        return bookReturned;
    }

}
