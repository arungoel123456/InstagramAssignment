package com.demo.dto;

import java.sql.*;
import java.time.*;
import java.util.*;

public class Profile {

    private String email;
    private String password;
    private String id;
    private List<Post> posts;
    private List<Profile> followers;
    private List<Profile> followings;
    private List<FollowRequest> followRequests;
    private Timeline timeline;
    private boolean isCelebrity;
    private LocalDateTime lastSeen;

    public Profile(String email, String password, String id) {
        this.email = email;
        this.password = password;
        this.id = id;
        followers= new ArrayList<>();
        followings= new ArrayList<>();
        followRequests= new ArrayList<>();
        timeline= new Timeline();
        isCelebrity= false;
        posts= new ArrayList<>();
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Profile> getFollowers() {
        return followers;
    }

    public void setFollowers(List<Profile> followers) {
        this.followers = followers;
    }

    public List<Profile> getFollowings() {
        return followings;
    }

    public void setFollowings(List<Profile> followings) {
        this.followings = followings;
    }

    public List<FollowRequest> getFollowRequests() {
        return followRequests;
    }

    public void setFollowRequests(List<FollowRequest> followRequests) {
        this.followRequests = followRequests;
    }

    public Timeline getTimeline() {
        return timeline;
    }

    public void setTimeline(Timeline timeline) {
        this.timeline = timeline;
    }

    public boolean isCelebrity() {
        return isCelebrity;
    }

    public void setCelebrity(boolean celebrity) {
        isCelebrity = celebrity;
    }

    public LocalDateTime getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(LocalDateTime lastSeen) {
        this.lastSeen = lastSeen;
    }
}
