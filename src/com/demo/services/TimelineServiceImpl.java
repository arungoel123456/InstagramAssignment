package com.demo.services;

import com.demo.dto.*;
import com.demo.interfaces.*;

import java.time.*;
import java.util.*;
import java.util.stream.*;

public class TimelineServiceImpl implements TimelineService {
    @Override
    public List<Post> fetchTimeline(Profile profile) {
        List<Post> posts= profile.getTimeline().getPosts();
        List<Post> celebPosts= pullCelebPosts(profile);
        posts.addAll(celebPosts);
        profile.getTimeline().setPosts(new ArrayList<>());
        return posts;
    }

    @Override
    public void addToTimeline(Post post, List<Profile> profiles) {
        profiles.stream().parallel().forEach(profile -> profile.getTimeline().getPosts().add(post));
    }

    private List<Post> pullCelebPosts(Profile profile){
        List<Post> posts=  new ArrayList<Post>();
        List<Profile> followings= profile.getFollowings();
        List<Profile> celebs= followings.stream().filter(following -> following.isCelebrity()).collect(Collectors.toList());
        celebs.stream().forEach( celeb -> posts.addAll( getPostsOfProfileAfterTime(profile.getLastSeen() , celeb.getPosts() ) ) );
        return posts;
    }

    private List<Post> getPostsOfProfileAfterTime(LocalDateTime lastSeen, List<Post> posts){
        // binary search;
        return posts;
    }

}
