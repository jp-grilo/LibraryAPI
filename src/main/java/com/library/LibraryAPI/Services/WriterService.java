package com.library.LibraryAPI.Services;

import com.library.LibraryAPI.Respositories.WriterRepository;
import org.springframework.stereotype.Service;

@Service
public class WriterService {
    final WriterRepository writerRepository;

    public WriterService(WriterRepository writerRepository) {
        this.writerRepository = writerRepository;
    }
}
