/*
 * Hasan Maanaki
 * Assign #3 - CRUD APP
 * Simple Book Manager application that uses Spring with JPA using CRUD to View/Create/Update/Delete books
 * Last Modified: 3/17/23
 * I followed the UNCG Academic Integrity Policy on this assignment.
 */
package com.csc340sp23.bookmanager.book;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Hasan
 */
public interface BookRepository extends JpaRepository<Book, Long> {

}
