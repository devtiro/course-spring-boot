package com.deviro.books.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book {

  private String isbn;

  private String title;

  private String author;

  private String yearPublished;
}
