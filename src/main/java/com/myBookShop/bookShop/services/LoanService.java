package com.myBookShop.bookShop.services;


import com.myBookShop.bookShop.models.User;
import com.myBookShop.bookShop.repository.BorrowedBooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanService {
    @Autowired
    BorrowedBooksRepository borrowedBooksRepository;

    // Creating a Loan
    public Loan createLoan(Loan loan) {
        return borrowedBooksRepository.save(loan);
    }

    // Getting all loans
    public List<User> getAllLoans() {
        return borrowedBooksRepository.findAll();
    }

    // Updating a loan
    public User updateLoan(Loan loan) {
        return borrowedBooksRepository.save(loan);
    }

    // Getting a specific loan by id
    public Loan getLoanById(String id) {
        return borrowedBooksRepository.findById(id).get();
    }

    // Delete a specific loan by using id
    public String deleteLoan(String id) {
        borrowedBooksRepository.deleteById(id);
        return "Loan has been terminated";
    }

}
