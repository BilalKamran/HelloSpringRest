package com.example.demo.controller;
import com.example.demo.entity.Topic;
import com.example.demo.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/topic")
public class TopicController {

    final TopicService topicService;

    @Autowired
    public TopicController(TopicService topicService) {
        this.topicService = topicService;
    }

    @GetMapping
    public List<Topic> getBooks() {

        return topicService.getBooks();
    }

    @GetMapping("/{id}")
    public Optional<Topic> getBook(@PathVariable(value="id") String id) {

        return topicService.getBook(id);
    }

    @PostMapping
    public Topic addBook(@Valid @RequestBody Topic topic){

        return topicService.saveBook(topic);
    }

    @PutMapping("/{id}")
    public Topic updateBook(@PathVariable(value="id") String id, @Valid @RequestBody Topic topic){

        return topicService.saveBook(topic);
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable(value="id") String id){

        topicService.deleteBook(id);
        return id;
    }
}
