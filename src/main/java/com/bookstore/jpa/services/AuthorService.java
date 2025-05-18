package com.bookstore.jpa.services;

import com.bookstore.jpa.dtos.AuthorRecordDto;
import com.bookstore.jpa.models.AuthorModel;
import com.bookstore.jpa.repositories.AuthorRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Transactional
    public AuthorModel saveAuthor(AuthorRecordDto authorRecordDto){
        AuthorModel author = new AuthorModel();
        author.setName(authorRecordDto.name());

        return authorRepository.save(author);
    }
}
