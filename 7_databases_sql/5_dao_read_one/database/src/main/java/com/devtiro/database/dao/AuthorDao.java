package com.devtiro.database.dao;

import com.devtiro.database.domain.Author;

import java.util.Optional;

public interface AuthorDao {
    void create(Author author);

    Optional<Author> findOne(long l);

}
