package com.github.samen66.newspaper.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Entity
@Table(name = "news")
@Data
@AllArgsConstructor
public class News {
    @Id
    private int news_id;

    @ManyToOne
    @JoinColumn(name = "source_id")
    private Source source;

    @ManyToMany
    @JoinTable(
            name = "news_topics",
            joinColumns = @JoinColumn(name = "news_id"),
            inverseJoinColumns = @JoinColumn(name = "topic_id")
    )
    private Set<Topic> topics;

    public News() {

    }
}
