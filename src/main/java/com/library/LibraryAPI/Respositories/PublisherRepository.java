package com.library.LibraryAPI.Respositories;

import com.library.LibraryAPI.Models.PublisherModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PublisherRepository extends JpaRepository<PublisherModel, UUID> {
}
