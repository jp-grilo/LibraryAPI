package com.library.LibraryAPI.Services;

import com.library.LibraryAPI.Respositories.BookRepository;
import com.library.LibraryAPI.Respositories.PublisherRepository;
import com.library.LibraryAPI.Respositories.WriterRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    final PublisherRepository publisherRepository;
    final WriterRepository writerRepository;
    final BookRepository bookRepository;

    public BookService(PublisherRepository publisherRepository, WriterRepository writerRepository, BookRepository bookRepository) {
        this.publisherRepository = publisherRepository;
        this.writerRepository = writerRepository;
        this.bookRepository = bookRepository;
    }

}
