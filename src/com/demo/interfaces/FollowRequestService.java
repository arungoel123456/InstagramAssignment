package com.demo.interfaces;

import com.demo.dto.*;

import java.util.*;

public interface FollowRequestService {
    void createFollowRequest(Profile sender, Profile receiver) throws Exception;
    List<FollowRequest> fetchAllRequest(Profile profile);
    void acceptFollowRequest(FollowRequest followRequest);
    void rejectFollowRequest(FollowRequest followRequest);

}
