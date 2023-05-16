package com.github.samen66.newspaper.rest;

import com.github.samen66.newspaper.model.Source;
import com.github.samen66.newspaper.service.SourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sources")
public class SourceController {

    @Autowired
    private SourceService newsSourceService;

    @GetMapping
    public ResponseEntity<List<Source>> getAllSources() {
        List<Source> list = newsSourceService.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Source> getSourceById(@PathVariable Integer id) {
        Source newsSource = newsSourceService.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("NewsSource not found with id: " + id));
        return ResponseEntity.ok(newsSource);
    }

    @PostMapping
    public ResponseEntity<Source> createSource(@RequestBody Source newsSource) {
        return ResponseEntity.ok(newsSourceService.save(newsSource));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Source> updateSource(@RequestBody Source newsSource, @PathVariable Integer id) {
        newsSource.setSource_id(id);
        return ResponseEntity.ok(newsSourceService.save(newsSource));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSource(@PathVariable Integer id) {
        newsSourceService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
