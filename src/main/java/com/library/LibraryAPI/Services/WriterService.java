package com.library.LibraryAPI.Services;

import com.library.LibraryAPI.Models.WriterModel;
import com.library.LibraryAPI.Respositories.WriterRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class WriterService {
    final WriterRepository writerRepository;

    public WriterService(WriterRepository writerRepository) {
        this.writerRepository = writerRepository;
    }

    @Transactional
    public WriterModel createWriter(WriterModel writerModel){
        return writerRepository.save(writerModel);
    }

    public List<WriterModel> getAllWriters (){
        return writerRepository.findAll();
    }

    public Optional<WriterModel> getWriterById(UUID id){
        return writerRepository.findById(id);
    }
    @Transactional
    public void deleteWriter(WriterModel writerModel){
        writerRepository.delete(writerModel);
    }
}
