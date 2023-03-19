package com.demo.services;

import com.demo.dto.*;
import com.demo.interfaces.*;

public class PostServiceImpl implements PostService {

    private TimelineService timelineService= new TimelineServiceImpl();
    @Override
    public void createPost(Profile profile, String description) {
        Post post= new Post(description, profile);
        profile.getPosts().add(post);
        if(!profile.isCelebrity()){
            timelineService.addToTimeline(post, profile.getFollowers());
        }
    }
}
