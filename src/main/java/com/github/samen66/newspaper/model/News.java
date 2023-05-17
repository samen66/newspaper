package com.github.samen66.newspaper.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Entity
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int news_id;

    @ManyToOne
    @JoinColumn(name = "source_id")
    @JsonBackReference("news-source")
    private Source source;

    @ManyToOne
    @JoinColumn(name = "topic_id")
    @JsonBackReference("news-topic")
    private Topic topic;

    public News() {

    }

    public News(int news_id, Source source, Topic topic) {
        this.news_id = news_id;
        this.source = source;
        this.topic = topic;
    }

    public int getNews_id() {
        return news_id;
    }

    public void setNews_id(int news_id) {
        this.news_id = news_id;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public Topic getTopics() {
        return topic;
    }

    public void setTopics(Topic topic) {
        this.topic = topic;
    }
}
