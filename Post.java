package com.alura.forohub.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "post")
    private List<Response> responses;

    // Getters y Setters
}
