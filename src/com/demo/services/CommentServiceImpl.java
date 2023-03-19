package com.demo.services;

import com.demo.dto.*;
import com.demo.interfaces.*;

public class CommentServiceImpl implements CommentService {

    public void createComment(String description, Profile createdBy, Commentable commentable){
        Comment comment= new Comment(description, createdBy);
        commentable.getComments().add(comment);
    }
}
