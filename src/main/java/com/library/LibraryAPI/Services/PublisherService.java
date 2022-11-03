package com.library.LibraryAPI.Services;

import com.library.LibraryAPI.Models.PublisherModel;
import com.library.LibraryAPI.Respositories.PublisherRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PublisherService {
    final PublisherRepository publisherRepository;

    public PublisherService(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @Transactional
    public PublisherModel createPublisher(PublisherModel publisherModel){
        return publisherRepository.save(publisherModel);
    }

    public List<PublisherModel> getAllPublishers (){
        return publisherRepository.findAll();
    }

    public Optional<PublisherModel> getPublisherById(UUID id){
        return publisherRepository.findById(id);
    }
    @Transactional
    public void deletePublisher(PublisherModel publisherModel){
        publisherRepository.delete(publisherModel);
    }
}
