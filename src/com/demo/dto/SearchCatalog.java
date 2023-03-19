package com.demo.dto;

import java.util.*;

public class SearchCatalog {
    private Map<String, Profile> profiles;
    private static SearchCatalog searchCatalog= null;
    private SearchCatalog() {
        this.profiles = new  HashMap<String, Profile>();
    }
    public static SearchCatalog getInstance(){
        if(searchCatalog== null){
            searchCatalog= new SearchCatalog();
        }
        return searchCatalog;
    }

    public Map<String, Profile> getProfiles() {
        return profiles;
    }

    public void setProfiles(Map<String, Profile> profiles) {
        this.profiles = profiles;
    }

}
