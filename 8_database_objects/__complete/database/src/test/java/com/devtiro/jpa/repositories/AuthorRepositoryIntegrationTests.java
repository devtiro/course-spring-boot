package com.devtiro.jpa.repositories;

import com.devtiro.jpa.domain.Author;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import java.util.Optional;

import static com.devtiro.jpa.TestDataUtil.*;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class AuthorRepositoryIntegrationTests {

    private final AuthorRepository underTest;

    @Autowired
    public AuthorRepositoryIntegrationTests(final AuthorRepository underTest) {
        this.underTest = underTest;
    }

    @Test
    public void testCreateAuthorWithId() {
        final Author author = createTestAuthorA();
        final Author savedAuthor = underTest.save(author);
        assertThat(author).isEqualTo(savedAuthor);
    }

    @Test
    public void testCreateAuthorWithoutId() {
        final Author author = createTestAuthorA();
        author.setId(null);
        final Author savedAuthor = underTest.save(author);
        assertThat(author).isEqualTo(savedAuthor);
    }

    @Test
    public void testCreateAndFindAuthorById() {
        final Author author = createTestAuthorB();
        final Author savedAuthor = underTest.save(author);
        final Optional<Author> result = underTest.findById(savedAuthor.getId());
        assertThat(result).isPresent();
        assertThat(result.get()).isEqualTo(savedAuthor);
    }

    @Test
    public void testCreateAndFindAllAuthors() {
        final Author testAuthorA = underTest.save(createTestAuthorA());
        final Author testAuthorB = underTest.save(createTestAuthorB());
        final Author testAuthorC = underTest.save(createTestAuthorC());
        final List<Author> expected = List.of(testAuthorA, testAuthorB, testAuthorC);

        final List<Author> result = underTest.findAll();
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testCreateUpdateAuthor() {
        final Author testAuthorA = underTest.save(createTestAuthorA());
        testAuthorA.setName("Updated");
        underTest.save(testAuthorA);
        final Optional<Author> result = underTest.findById(testAuthorA.getId());
        assertThat(result).isPresent();
        assertThat(result.get()).isEqualTo(testAuthorA);
    }

    @Test
    public void testCreateDeleteAuthor() {
        final Author testAuthorA = underTest.save(createTestAuthorA());
        final Optional<Author> saveResult = underTest.findById(testAuthorA.getId());
        assertThat(saveResult).isPresent();

        underTest.deleteById(testAuthorA.getId());
        final Optional<Author> result = underTest.findById(testAuthorA.getId());
        assertThat(result).isNotPresent();
    }

}
