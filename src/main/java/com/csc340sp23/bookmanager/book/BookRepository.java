package com.csc340sp23.bookmanager.book;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Dallin Pierce
 */
public interface BookRepository extends JpaRepository<Book, Long>{
    
}
