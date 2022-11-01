package com.library.LibraryAPI.Controllers;

import com.library.LibraryAPI.Services.PublisherService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublisherController {
    final PublisherService publisherService;

    public PublisherController(PublisherService publisherService) {
        this.publisherService = publisherService;
    }
}
