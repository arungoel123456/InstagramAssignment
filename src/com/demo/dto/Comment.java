package com.demo.dto;

import java.util.*;

public class Comment implements Likeable , Commentable{
    private String description;
    private Profile createdBy;
    private List<Comment> comments;
    private List<Like> likes;

    public Comment(String description, Profile createdBy) {
        this.description = description;
        this.createdBy = createdBy;
        comments= new ArrayList<>();
        likes= new ArrayList<>();
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreatedBy(Profile createdBy) {
        this.createdBy = createdBy;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public void setLikes(List<Like> likes) {
        this.likes = likes;
    }

    public String getDescription() {
        return description;
    }

    public Profile getCreatedBy() {
        return createdBy;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public List<Like> getLikes() {
        return likes;
    }
}
