/*
 * Hasan Maanaki
 * Assign #3 - CRUD APP
 * Simple Book Manager application that uses Spring with JPA using CRUD to View/Create/Update/Delete books
 * Last Modified: 3/17/23
 * I followed the UNCG Academic Integrity Policy on this assignment.
 */
package com.csc340sp23.bookmanager.book;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Book Manager App using CRUD to View/Create/Update/Delete books
 *
 * @author Hasan Maanaki
 */
@Entity
@Table(name = "book")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String author;
    private String isbn;
    private double price;

    public Book(String title, String author, String isbn, double price) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
    }

}
