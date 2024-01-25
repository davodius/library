package com.myBookShop.bookShop.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "books")
public class Book {
    @Id
    private String id;

    private String title;

    private String description;

    private String author;

    // private String procuredBy = "Librarian";
    //@CreatedDate          FRÅGA OM.
    //private Date created_at;


    public Book() {
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getAuthor() {
        return author;
    }

}
