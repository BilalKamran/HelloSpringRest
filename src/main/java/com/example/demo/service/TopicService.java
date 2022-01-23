package com.example.demo.service;

import com.example.demo.entity.Topic;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface TopicService {
    List<Topic> getBooks();

    Optional<Topic> getBook(String id);

    Topic saveBook(Topic topic);

    void deleteBook(String id);

}
