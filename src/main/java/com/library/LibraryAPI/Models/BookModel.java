package com.library.LibraryAPI.Models;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "book-table")
public class BookModel {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID Id;
    @Column(name = "Name")
    private String Name;
    @ManyToOne
    @JoinColumn
    private WriterModel WriterModel;
    @ManyToOne
    @JoinColumn
    private PublisherModel PublisherModel;

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

    public WriterModel getWriter() {
        return WriterModel;
    }

    public void setWriter(WriterModel writerModel) {
        WriterModel = writerModel;
    }

    public PublisherModel getPublisher() {
        return PublisherModel;
    }

    public void setPublisher(PublisherModel publisherModel) {
        PublisherModel = publisherModel;
    }
}
