package com.devtiro.database.services;

import com.devtiro.database.domain.entities.BookEntity;

public interface BookService {

    BookEntity createBook(String isbn, BookEntity book);
}
