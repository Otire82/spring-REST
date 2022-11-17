package com.example.springREST.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springREST.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    List<Book> findByTitleContainingOrContentContaining(String text, String textAgain);
    
}
