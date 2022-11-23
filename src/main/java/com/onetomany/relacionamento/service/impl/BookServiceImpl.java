package com.onetomany.relacionamento.service.impl;

import com.onetomany.relacionamento.model.Book;
import com.onetomany.relacionamento.model.Story;
import com.onetomany.relacionamento.repository.BookRepository;
import com.onetomany.relacionamento.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book saveBook(Book book) {
        List<Story> storyList = new ArrayList<>();
        // criando primeira story
        Story story1 = new Story();
        story1.setStoryName("Arrays");
        // criando segundo second story
        Story story2 = new Story();
        story2.setStoryName("Pointers");
        // criando terceiro story
        Story story3 = new Story();
        story3.setStoryName("Loops");
        // adicionado store na storyList. Até aqui, preparamos dados para OneToMany
        storyList.add(story1);
        storyList.add(story2);
        storyList.add(story3);
        // Preparar dados para ManyToOne
        story1.setBook(book);
        story2.setBook(book);
        story3.setBook(book);
        book.setStoryList(storyList);
        book = bookRepository.save(book);
        return book;
    }
    public Book findByBookId(int bookId) {
        return bookRepository.findByBookId(bookId);
    }
}
