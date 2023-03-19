package com.demo.services;

import com.demo.dto.*;
import com.demo.interfaces.*;

import java.util.*;

public class SearchServiceImpl implements SearchService {
    @Override
    public List<Profile> searchProfile(String searchKey) {
        Map<String, Profile> profiles= SearchCatalog.getInstance().getProfiles();
        return null;
    }
}
