package com.library.LibraryAPI.Models;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "publisher-table")
public class Publisher {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID Id;
    @Column(name = "Name")
    private String Name;
    @OneToMany
    private List<Book> PublishedBooks;

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

    public List<Book> getPublishedBooks() {
        return PublishedBooks;
    }

    public void setPublishedBooks(List<Book> publishedBooks) {
        PublishedBooks = publishedBooks;
    }
}
