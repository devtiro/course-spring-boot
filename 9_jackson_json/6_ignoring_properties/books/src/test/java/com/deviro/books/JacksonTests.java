package com.deviro.books;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

import com.deviro.books.domain.Book;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

public class JacksonTests {

  @Test
  public void testThatObjectMapperCanCreateJsonFromJavaObject() throws JsonProcessingException {
    ObjectMapper objectMapper = new ObjectMapper();
    Book book =
        Book.builder()
            .isbn("978-0-13-478627-5")
            .title("The Enigma of Eternity")
            .author("Aria Montgomery")
            .yearPublished("2005")
            .build();

    String result = objectMapper.writeValueAsString(book);
    assertThat(result)
        .isEqualTo(
            "{\"isbn\":\"978-0-13-478627-5\",\"title\":\"The Enigma of Eternity\",\"author\":\"Aria"
                + " Montgomery\",\"year\":\"2005\"}");
  }

  @Test
  public void testThatObjectMapperCanCreateJavaObjectFromJsonObject()
      throws JsonProcessingException {
    Book book =
        Book.builder()
            .isbn("978-0-13-478627-5")
            .title("The Enigma of Eternity")
            .author("Aria Montgomery")
            .yearPublished("2005")
            .build();
    String json =
        "{\"foo\":\"bar\", \"isbn\":\"978-0-13-478627-5\",\"title\":\"The Enigma of"
            + " Eternity\",\"author\":\"Aria Montgomery\",\"year\":\"2005\"}";

    final ObjectMapper objectMapper = new ObjectMapper();

    Book result = objectMapper.readValue(json, Book.class);
    assertThat(result).isEqualTo(book);
  }
}
