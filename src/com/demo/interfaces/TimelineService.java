package com.demo.interfaces;

import com.demo.dto.*;

import java.util.*;

public interface TimelineService {
    List<Post> fetchTimeline(Profile profile);
    void addToTimeline(Post post, List<Profile> profiles);
}
