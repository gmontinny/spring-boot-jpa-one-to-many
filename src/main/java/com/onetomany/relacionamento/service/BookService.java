package com.onetomany.relacionamento.service;

import com.onetomany.relacionamento.model.Book;
import org.springframework.stereotype.Component;

@Component
public interface BookService {
    public Book saveBook(Book book);
    public Book findByBookId(int bookId);
}
