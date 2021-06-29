package com.ajones.springbootstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics") // GET METHOD 1
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}") // GET METHOD 2
    public Topic getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }

    @PostMapping("/topics") // POST METHOD
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    @PutMapping("/topics/{id}") // PUT METHOD
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id){
        topicService.updateTopic(id, topic);
    }

    @DeleteMapping("/topics/{id}") // DELETE METHOD
    public void deleteTopic(@RequestBody Topic topic, @PathVariable String id){
        topicService.deleteTopic(id, topic);
    }
}
