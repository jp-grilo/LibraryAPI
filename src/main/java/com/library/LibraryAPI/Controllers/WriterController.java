package com.library.LibraryAPI.Controllers;

import com.library.LibraryAPI.Services.WriterService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/Writer")
public class WriterController {
    final WriterService writerService;

    public WriterController(WriterService writerService) {
        this.writerService = writerService;
    }
}
