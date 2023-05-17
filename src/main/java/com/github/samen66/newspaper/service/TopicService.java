package com.github.samen66.newspaper.service;

import com.github.samen66.newspaper.model.Topic;
import com.github.samen66.newspaper.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class TopicService {
    private TopicRepository newsTopicRepository;
    @Autowired
    public TopicService(TopicRepository newsTopicRepository) {
        this.newsTopicRepository = newsTopicRepository;
    }

    public List<Topic> findAll() {
        return newsTopicRepository.findAll();
    }

    public Optional<Topic> findById(Integer id) {
        return newsTopicRepository.findById(id);
    }

    public Topic save(Topic newsTopic) {
        return newsTopicRepository.save(newsTopic);
    }

    public void deleteById(Integer id) {
        newsTopicRepository.deleteById(id);
    }
}

