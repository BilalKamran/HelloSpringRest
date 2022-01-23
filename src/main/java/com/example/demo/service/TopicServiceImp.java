package com.example.demo.service;

import com.example.demo.repository.TopicRepository;
import com.example.demo.entity.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TopicServiceImp implements TopicService {

    final TopicRepository topicRepository;

    @Autowired
    public TopicServiceImp(TopicRepository topicRepository) {
        this.topicRepository = topicRepository;
    }

    @Override
    public List<Topic> getBooks() {
        return topicRepository.findAll();
    }

    @Override
    public Optional<Topic> getBook(String id) {
        return topicRepository.findById(id);
    }

    @Override
    public Topic saveBook(Topic topic) {
        return topicRepository.save(topic);
    }

    @Override
    public void deleteBook(String id) {
        topicRepository.deleteById(id);
    }
}
