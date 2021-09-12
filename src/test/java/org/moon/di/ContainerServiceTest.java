package org.moon.di;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ContainerServiceTest {

    @Test
    public void getObect_BookRepository() {
        BookRepository bookRepository = ContainerService.getObect(BookRepository.class);

        assertNotNull(bookRepository);
    }

    @Test
    public void getObect_BookService() {
        BookService bookService = ContainerService.getObect(BookService.class);

        assertNotNull(bookService);
        assertNotNull(bookService.bookRepository);
    }
}