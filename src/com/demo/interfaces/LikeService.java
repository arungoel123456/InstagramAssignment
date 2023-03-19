package com.demo.interfaces;

import com.demo.dto.*;

public interface LikeService {
    void like(Likeable likeable, Profile createdBy);
    void unlike(Likeable likeable, Profile createdBy);

}
