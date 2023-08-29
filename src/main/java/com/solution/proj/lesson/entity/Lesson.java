package com.solution.proj.lesson.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "lessons")
@Data
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(name = "header")
    private String header;
    @Column(name = "text")
    private String text;
    @Column(name = "author")
    private String author;
    @Column(name = "images")
    @ElementCollection
    private List<String> imagesUrl;
    @Column(name = "attribute")
    private String attribute;
}
