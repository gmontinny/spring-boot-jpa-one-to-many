package com.onetomany.relacionamento.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookId;
    @Column(name = "book_name")
    private String bookName;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "book", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("book")
    private List<Story> storyList = new ArrayList<>();
}
