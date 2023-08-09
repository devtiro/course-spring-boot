package com.devtiro.database.services;

import com.devtiro.database.domain.entities.BookEntity;

import java.util.List;
import java.util.Optional;

public interface BookService {

    BookEntity createBook(String isbn, BookEntity book);

    List<BookEntity> findAll();
    Optional<BookEntity> findOne(String isbn);
}
