package com.github.samen66.newspaper.rest;

import com.github.samen66.newspaper.model.Topic;
import com.github.samen66.newspaper.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/topics")
public class TopicController {

    @Autowired
    private TopicService newsTopicService;

    @GetMapping
    public ResponseEntity<List<Topic>> getAllTopics() {
        List<Topic> list = newsTopicService.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Topic> getTopicById(@PathVariable Integer id) {
        Topic newsTopic = newsTopicService.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("NewsTopic not found with id: " + id));
        return ResponseEntity.ok(newsTopic);
    }

    @PostMapping
    public ResponseEntity<Topic> createTopic(@RequestBody Topic newsTopic) {
        return ResponseEntity.ok(newsTopicService.save(newsTopic));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Topic> updateTopic(@RequestBody Topic newsTopic, @PathVariable Integer id) {
        newsTopic.setTopic_id(id);
        return ResponseEntity.ok(newsTopicService.save(newsTopic));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTopic(@PathVariable Integer id) {
        newsTopicService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
