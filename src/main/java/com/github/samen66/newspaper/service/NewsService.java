package com.github.samen66.newspaper.service;

import com.github.samen66.newspaper.model.News;
import com.github.samen66.newspaper.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NewsService {

    private final NewsRepository repository;

    @Autowired
    public NewsService(NewsRepository repository) {
        this.repository = repository;
    }

    public List<News> findAll() {
        return repository.findAll();
    }

    public News create(News news) {
        return repository.save(news);
    }

    public List<News> findAll(Integer pageNo, Integer pageSize) {
        Pageable paging = PageRequest.of(pageNo, pageSize);
        Page<News> pagedResult = repository.findAll(paging);
        return pagedResult.getContent();
    }

    public Optional<News> findById(Integer id) {
        return repository.findById(id);
    }

    public News save(News news) {
        return repository.save(news);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
