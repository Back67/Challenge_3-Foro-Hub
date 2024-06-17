package com.alura.forohub.model;

import javax.persistence.*;

@Entity
public class Response {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;

    @ManyToOne
    private Post post;

    @ManyToOne
    private User user;

    // Getters y Setters
}
