package com.github.samen66.newspaper.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "sources")
public class Source {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long source_id;

    private String name;

    @OneToMany(mappedBy = "source")
    private Set<News> news;
}
