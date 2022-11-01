package com.library.LibraryAPI.Services;

import com.library.LibraryAPI.Respositories.PublisherRepository;
import org.springframework.stereotype.Service;

@Service
public class PublisherService {
    final PublisherRepository publisherRepository;

    public PublisherService(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }
}
