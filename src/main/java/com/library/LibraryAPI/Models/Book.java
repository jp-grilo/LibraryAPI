package com.library.LibraryAPI.Models;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "book-table")
public class Book {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID Id;
    @Column(name = "Name")
    private String Name;
    @ManyToOne
    @JoinColumn
    private Writer Writer;
    @ManyToOne
    @JoinColumn
    private Publisher Publisher;

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

    public com.library.LibraryAPI.Models.Writer getWriter() {
        return Writer;
    }

    public void setWriter(com.library.LibraryAPI.Models.Writer writer) {
        Writer = writer;
    }

    public com.library.LibraryAPI.Models.Publisher getPublisher() {
        return Publisher;
    }

    public void setPublisher(com.library.LibraryAPI.Models.Publisher publisher) {
        Publisher = publisher;
    }
}
