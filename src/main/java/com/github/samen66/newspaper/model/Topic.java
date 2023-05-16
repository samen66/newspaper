package com.github.samen66.newspaper.model;

import jakarta.persistence.*;

import java.util.Set;
@Entity
@Table(name = "topics")
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long topic_id;

    private String name;

    @ManyToMany(mappedBy = "topics")
    private Set<News> news;
}
