package com.demo.interfaces;

import com.demo.dto.*;

public interface CommentService {
    void createComment(String description, Profile createdBy, Commentable commentable);
}
