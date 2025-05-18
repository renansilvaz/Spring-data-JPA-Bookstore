package com.bookstore.jpa.repositories;

import com.bookstore.jpa.models.AuthorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.UUID;

public interface AuthorRepository extends JpaRepository<AuthorModel, UUID> {

    AuthorModel findByName(String name);
}
