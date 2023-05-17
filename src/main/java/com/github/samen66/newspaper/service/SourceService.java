package com.github.samen66.newspaper.service;

import com.github.samen66.newspaper.model.Source;
import com.github.samen66.newspaper.repository.SourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SourceService {


    private SourceRepository newsSourceRepository;
    @Autowired
    public SourceService(SourceRepository newsSourceRepository) {
        this.newsSourceRepository = newsSourceRepository;
    }

    public List<Source> findAll() {
        return newsSourceRepository.findAll();
    }

    public Optional<Source> findById(Integer id) {
        return newsSourceRepository.findById(id);
    }

    public Source save(Source newsSource) {
        return newsSourceRepository.save(newsSource);
    }

    public void deleteById(Integer id) {
        newsSourceRepository.deleteById(id);
    }
}
