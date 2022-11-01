package com.library.LibraryAPI.Controllers;

import com.library.LibraryAPI.Services.WriterService;

public class WriterController {
    final WriterService writerService;

    public WriterController(WriterService writerService) {
        this.writerService = writerService;
    }
}
