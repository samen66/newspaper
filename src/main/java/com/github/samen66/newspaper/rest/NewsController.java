package com.github.samen66.newspaper.rest;

import com.github.samen66.newspaper.model.News;
import com.github.samen66.newspaper.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/news")
public class NewsController {
    private final NewsService newsService;

    @Autowired
    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @GetMapping
    public ResponseEntity<List<News>> getAllNews() {
        List<News> newsList = newsService.findAll();
        return new ResponseEntity<>(newsList, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<News> createNews(@RequestBody News news) {
        News createdNews = newsService.create(news);
        return new ResponseEntity<>(createdNews, HttpStatus.CREATED);
    }
//    @GetMapping
//    public ResponseEntity<List<News>> getAllNews(@RequestParam(defaultValue = "0") Integer pageNo,
//                                                 @RequestParam(defaultValue = "10") Integer pageSize) {
//        List<News> list = newsService.findAll(pageNo, pageSize);
//        return ResponseEntity.ok(list);
//    }

    @GetMapping("/{id}")
    public ResponseEntity<News> getNewsById(@PathVariable Integer id) {
        News news = newsService.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("News not found with id: " + id));
        return ResponseEntity.ok(news);
    }


    @PutMapping("/{id}")
    public ResponseEntity<News> updateNews(@RequestBody News news, @PathVariable Integer id) {
        news.setNews_id(id);
        return ResponseEntity.ok(newsService.save(news));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteNews(@PathVariable Integer id) {
        newsService.deleteById(id);
        Optional<News> optionalNews = newsService.findById(id);
        return (optionalNews.isPresent() ? ResponseEntity.status(HttpStatus.BAD_REQUEST):ResponseEntity.status(HttpStatus.OK)).build();
    }
}
