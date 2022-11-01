package com.library.LibraryAPI.Respositories;

import com.library.LibraryAPI.Models.WriterModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface WriterRepository extends JpaRepository<WriterModel, UUID> {
}
