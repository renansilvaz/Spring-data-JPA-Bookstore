package com.bookstore.jpa.services;


import com.bookstore.jpa.dtos.PublisherRecordDto;
import com.bookstore.jpa.models.PublisherModel;
import com.bookstore.jpa.repositories.PublisherRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PublisherService {

    private final PublisherRepository publisherRepository;

    public PublisherService(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @Transactional
    public PublisherModel savePublisher(PublisherRecordDto publisherRecordDto){
        PublisherModel publisher = new PublisherModel();
        publisher.setName(publisherRecordDto.name());

        return publisherRepository.save(publisher);
    }
}
