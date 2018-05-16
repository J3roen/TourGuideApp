package com.example.android.tourguideapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentStatePagerAdapter {
private ArrayList<ListItem> shopList = new ArrayList<>();
private ArrayList<ListItem> drinkList = new ArrayList<>();
private ArrayList<ListItem> eatList = new ArrayList<>();
private ArrayList<ListItem> sleepList = new ArrayList<>();

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
        /**fill the 4 lists with corresponding data*/
        initializeData();
    }

    @Override
    public Fragment getItem(int position) {
        ArrayList<ListItem> dataSet;
        /** getItem is called to instantiate the fragment for the given page.
         Return a PlaceholderFragment.*/
        switch (position) {
            case 0: dataSet = shopList;
            break;
            case 1: dataSet = drinkList;
            break;
            case 2: dataSet = eatList;
            break;
            case 3: dataSet = sleepList;
            break;
            default: throw new Error("current fragment tab position is unknown");
        }
        return PlaceholderFragment.newInstance(position + 1, dataSet);
    }

    @Override
    public int getCount() {
        // Show 4 total pages.
        return 4;
    }

    private void initializeData() {
        /** create reusable variables for data initializing*/
        ArrayList<ListItem> dataList = new ArrayList<>();
        int imgId;
        String name;
        String location;
        HashMap<String, String> openingHours = new HashMap<>();
        String description;
        String tel;

        /** fill in the Shop dataset with data, currently hardcoded*/
        imgId = R.drawable.apc;
        name = "A.P.C.";
        location = "Lombardenvest 12";
        openingHours.put("Monday","10:30 - 18:00");
        openingHours.put("Tuesday","10:30 - 18:00");
        openingHours.put("Wednesday","10:30 - 18:00");
        openingHours.put("Thursday","10:30 - 18:00");
        openingHours.put("Friday","10:30 - 18:00");
        openingHours.put("Saturday","10:30 - 18:00");
        openingHours.put("Sunday","10:30 - 18:00");
        description = "A.P.C. is a small sop, but has everything to make shopping an amazing experience.\nEasy to combine basics for both men and women. Less is more!";
        tel = "0032 3 226 50 54";
        ListItem item = new ListItem(imgId, name,tel, location, openingHours, description);
        dataList.add(item);

        imgId = R.drawable.otherstories;
        name = "& Other Stories";
        location = "Korte Gasthuisstraat 17";
        openingHours.put("Monday","10:00 - 18:30");
        openingHours.put("Tuesday","10:00 - 18:30");
        openingHours.put("Wednesday","10:00 - 18:30");
        openingHours.put("Thursday","10:00 - 18:30");
        openingHours.put("Friday","10:00 - 18:30");
        openingHours.put("Saturday","10:00 - 18:30");
        openingHours.put("Sunday","10:00 - 18:30");
        description = "& Other Stories is a true shopping paradise.\nShoes, handbags, fashion and accessories, but you can also score some lingerie and beauty products.";
        tel = "0032 3 707 27 14";
        item = new ListItem(imgId, name,tel, location, openingHours, description);
        dataList.add(item);

        imgId = R.drawable.belgiancompany;
        name = "Belgian Company";
        location = "Lombardenvest 18";
        openingHours.put("Monday","12:00 - 18:00");
        openingHours.put("Tuesday","12:00 - 18:00");
        openingHours.put("Wednesday","12:00 - 18:00");
        openingHours.put("Thursday","12:00 - 18:00");
        openingHours.put("Friday","12:00 - 18:00");
        openingHours.put("Saturday","12:00 - 18:00");
        openingHours.put("Sunday","12:00 - 18:00");
        description = "Want to expand your wardrobe with a basic, comfortable piece?\nThen you will find exactly what you are looking for at the great Belgian Company in Antwerp!";
        tel = "0032 475 59 94 80";
        item = new ListItem(imgId, name,tel, location, openingHours, description);
        dataList.add(item);

        imgId = R.drawable.zoomoon;
        name = "Zoomoon";
        location = "Riemstraat 17";
        openingHours.put("Monday","closed");
        openingHours.put("Tuesday","closed");
        openingHours.put("Wednesday","11:00 - 18:00");
        openingHours.put("Thursday","11:00 - 18:00");
        openingHours.put("Friday","11:00 - 18:00");
        openingHours.put("Saturday","11:00 - 18:00");
        openingHours.put("Sunday","11:00 - 18:00");
        description = "ZooMoon is a dynamic shop with a  mix of different brands for young men.\nAdditionally, ZooMoon also organizes workshops for creative young people.";
        tel = "0032 3 689 88 68";
        item = new ListItem(imgId, name,tel, location, openingHours, description);
        dataList.add(item);

        this.shopList = dataList;
        this.drinkList = dataList;
        this.eatList = dataList;
        this.sleepList = dataList;
        //TODO fill in Drink, Eat and Sleep datasets
    }
}
