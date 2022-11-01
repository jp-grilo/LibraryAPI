package com.library.LibraryAPI.Models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "writer-table")
public class Writer implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID Id;
    @Column(nullable = false, unique = true)
    private String Name;
    @OneToMany
    @JoinColumn
    private List<Book> WrittenBooks;

    public UUID getId() {
        return Id;
    }

    public void setId(UUID id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<Book> getWrittenBooks() {
        return WrittenBooks;
    }

    public void setWrittenBooks(List<Book> writtenBooks) {
        WrittenBooks = writtenBooks;
    }
}
