package com.devtiro.database.services;

import com.devtiro.database.domain.entities.BookEntity;

import java.util.List;

public interface BookService {

    BookEntity createBook(String isbn, BookEntity book);

    List<BookEntity> findAll();
}
