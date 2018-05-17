package com.example.android.tourguideapp;

import java.io.Serializable;
import java.util.HashMap;

public class ListItem implements Serializable{

    private int imgId;
    private String name;
    private String location;
    private HashMap<String, String> openingHours = new HashMap<>();
    private String description;
    private String tel;

    public ListItem(int imgId, String name,String tel, String location, HashMap<String,String> openingHours, String description) {
        this.imgId = imgId;
        this.name = name.trim();
        this.tel = tel.trim();
        this.location = location.trim();
        this.description = description.trim();
        this.openingHours.putAll(openingHours);
    }

    public int getImgId() {
        return imgId;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public HashMap<String, String> getOpeningHours() {
        return openingHours;
    }

    public String getDescription() {
        return description;
    }

    public String getTel() {
        return tel;
    }



}
