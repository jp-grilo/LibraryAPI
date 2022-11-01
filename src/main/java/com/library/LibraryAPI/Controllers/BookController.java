package com.library.LibraryAPI.Controllers;

import com.library.LibraryAPI.Services.BookService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/book")
public class BookController {
    final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }


}
