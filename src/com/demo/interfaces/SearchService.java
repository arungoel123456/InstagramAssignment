package com.demo.interfaces;

import com.demo.dto.*;

import java.util.*;

public interface SearchService {
    List<Profile> searchProfile(String searchKey);
}
