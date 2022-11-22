package com.onetomany.relacionamento.repository;

import com.onetomany.relacionamento.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {
    public Book findByBookId(int bookId);
}
