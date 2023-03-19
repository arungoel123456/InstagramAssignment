package com.demo.services;

import com.demo.dto.*;
import com.demo.followRequestState.*;
import com.demo.interfaces.*;

import java.util.*;

public class FollowRequestServiceImpl implements FollowRequestService {
    @Override
    public void createFollowRequest(Profile sender, Profile receiver) throws Exception {
        if(checkIfPresent(sender, receiver)){
            throw new Exception("Follow Request already present");
        }
        FollowRequest followRequest= new FollowRequest(sender, receiver);
        receiver.getFollowRequests().add(followRequest);
        followRequest.sendNotification();
    }

    @Override
    public List<FollowRequest> fetchAllRequest(Profile profile) {
        return profile.getFollowRequests();
    }

    @Override
    public void acceptFollowRequest(FollowRequest followRequest) {
        followRequest.setFollowRequestState(new AcceptedState());
        followRequest.sendNotification();
        removeFollowRequest(followRequest);
        followRequest.getReceiver().getFollowers().add(followRequest.getSender());
    }

    @Override
    public void rejectFollowRequest(FollowRequest followRequest) {
        followRequest.setFollowRequestState(new DeclinedState());
        followRequest.sendNotification();
        removeFollowRequest(followRequest);
    }

    private void removeFollowRequest(FollowRequest followRequest){
        followRequest.getReceiver().getFollowRequests().remove(followRequest);
    }


    private boolean checkIfPresent(Profile sender, Profile receiver){
        List<FollowRequest> followRequests= receiver.getFollowRequests();
        return followRequests.stream().parallel().filter(followRequest -> followRequest.getSender().equals(sender)).findFirst().isPresent();
    }
}
