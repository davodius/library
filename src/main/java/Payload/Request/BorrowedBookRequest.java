package Payload.Request;


import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
import java.util.Date;

public class BorrowedBookRequest {

    private String bookId;

    private String userId;

    @CreatedDate
    private Date borrowedDate;

    private LocalDateTime returnDate = LocalDateTime.now().plusMonths(1);

    private boolean bookReturned;


    public BorrowedBookRequest() {
    }




    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getBorrowedDate() {
        return borrowedDate;
    }

    public void setBorrowedDate(Date borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    public LocalDateTime getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDateTime returnDate) {
        this.returnDate = returnDate;
    }

    public boolean isBookReturned() {
        return bookReturned;
    }

    public void setBookReturned(boolean bookReturned) {
        this.bookReturned = bookReturned;
    }


    public String getBookTitle() {
        return bookId;
    }

    public void setBookTitle(String bookTitle) {
        this.bookId = bookTitle;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }
}
