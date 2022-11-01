package com.library.LibraryAPI.Services;

import com.library.LibraryAPI.Respositories.WriterRepository;

public class WriterService {
    final WriterRepository writerRepository;

    public WriterService(WriterRepository writerRepository) {
        this.writerRepository = writerRepository;
    }
}
