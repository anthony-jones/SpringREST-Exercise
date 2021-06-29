package com.ajones.springbootstarter.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("spring", "Spring Framework", "Spring framework description"),
            new Topic("java", "Core Java", "Core Java description"),
            new Topic("javascript", "Javascript", "Javascript description")));

    public List<Topic> getAllTopics(){
        return topics;
    }

    public Topic getTopic(String id){
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic){
        topics.add(topic);
    }

    public void updateTopic(String id, Topic topic) {
        for(Topic t : topics){
            if (t.getId().equals(id)){
                topics.set(topics.indexOf(t), topic);
                return;
            }
        }
    }

    public void deleteTopic(String id, Topic topic) {
        for(Topic t : topics){
            if(t.getId().equals(id)){
                topics.remove(t);
                return;
            }
        }
    }
}
