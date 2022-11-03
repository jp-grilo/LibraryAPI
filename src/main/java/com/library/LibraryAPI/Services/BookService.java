package com.library.LibraryAPI.Services;

import com.library.LibraryAPI.Models.BookModel;
import com.library.LibraryAPI.Respositories.BookRepository;
import com.library.LibraryAPI.Respositories.PublisherRepository;
import com.library.LibraryAPI.Respositories.WriterRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

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

    @Transactional
    public BookModel createPublisher(BookModel publisherModel){
        return bookRepository.save(publisherModel);
    }

    public List<BookModel> getAllPublishers (){
        return bookRepository.findAll();
    }

    public Optional<BookModel> getPublisherById(UUID id){
        return bookRepository.findById(id);
    }
    @Transactional
    public void deletePublisher(BookModel bookModel){
        bookRepository.delete(bookModel);
    }
}
