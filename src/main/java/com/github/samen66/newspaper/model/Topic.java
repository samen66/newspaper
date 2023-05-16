package com.github.samen66.newspaper.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;
@Entity
@Table(name = "topics")
@Data
@AllArgsConstructor
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int topic_id;

    private String name;

    @ManyToMany(mappedBy = "topics")
    private Set<News> news;

    public Topic() {

    }
}
