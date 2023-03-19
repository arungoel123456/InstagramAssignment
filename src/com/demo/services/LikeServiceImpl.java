package com.demo.services;

import com.demo.dto.*;
import com.demo.interfaces.*;

import java.util.*;
import java.util.concurrent.locks.*;
import java.util.stream.*;

public class LikeServiceImpl implements LikeService {
    ReentrantLock lock= new ReentrantLock();

    public void like(Likeable likeable, Profile createdBy){
        if(!checkIfPresent(likeable, createdBy)){
            lock.lock();
            if(!checkIfPresent(likeable, createdBy)){
                Like like = new Like(createdBy);
                likeable.getLikes().add(like);
            }
            lock.unlock();
        }
    }

    public void unlike(Likeable likeable, Profile createdBy){
        if(checkIfPresent(likeable, createdBy)){
            lock.lock();
            if(checkIfPresent(likeable, createdBy)){
                Like like2= likeable.getLikes().stream().filter(like -> like.getProfile().equals(createdBy)).collect(Collectors.toList()).get(0);
                likeable.getLikes().remove(like2);
            }
            lock.unlock();
        }
    }

    private boolean checkIfPresent(Likeable likeable, Profile profile){
        List<Like> likes= likeable.getLikes();
        return likes.stream().parallel().filter(like -> like.getProfile().equals(profile)).findFirst().isPresent();
    }
}
