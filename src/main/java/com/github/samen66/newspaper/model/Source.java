package com.github.samen66.newspaper.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Entity
@Table(name = "sources")
@Data
@AllArgsConstructor
public class Source {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int source_id;

    private String name;

    @OneToMany(mappedBy = "source")
    private Set<News> news;

    public Source() {

    }
}
