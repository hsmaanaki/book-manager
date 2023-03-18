/*
 * Hasan Maanaki
 * Assign #3 - CRUD APP
 * Simple Book Manager application that uses Spring with JPA using CRUD to View/Create/Update/Delete books
 * Last Modified: 3/17/23
 * I followed the UNCG Academic Integrity Policy on this assignment.
 */
package com.csc340sp23.bookmanager.book;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Hasan
 */
@Service
public class BookService {

    @Autowired
    private BookRepository repo;

    public List<Book> findAllBooks() {
        return repo.findAll();
    }

    public Book addBook(Book book) {
        return repo.save(book);
    }

    public Book updateBook(Integer bookId, Book book) {
        return repo.save(book);
    }

    public List<Book> getAllBooks() {
        return repo.findAll();
    }

    public Book getBook(long bookId) {
        return repo.getReferenceById(bookId);
    }

    public void deleteBook(long bookId) {
        repo.deleteById(bookId);
    }

    void saveBook(Book book) {
        repo.save(book);
    }
}
