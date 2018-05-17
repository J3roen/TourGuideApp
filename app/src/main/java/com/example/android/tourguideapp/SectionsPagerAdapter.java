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
        initializeShopList();
        initializeDrinkList();
        initializeEatList();
        initializeSleepList();
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

    private void initializeShopList() {
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
        description = "A.P.C. is a small sop, but has everything to make shopping an amazing experience. Easy to combine basics for both men and women. Less is more!";
        tel = "0032 3 226 50 54";
        ListItem item = new ListItem(imgId, name,tel, location, openingHours, description);
        dataList.add(item);
        openingHours.clear();

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
        description = "& Other Stories is a true shopping paradise.Shoes, handbags, fashion and accessories, but you can also score some lingerie and beauty products.";
        tel = "0032 3 707 27 14";
        item = new ListItem(imgId, name,tel, location, openingHours, description);
        dataList.add(item);
        openingHours.clear();

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
        description = "Want to expand your wardrobe with a basic, comfortable piece? Then you will find exactly what you are looking for at the great Belgian Company in Antwerp!";
        tel = "0032 475 59 94 80";
        item = new ListItem(imgId, name,tel, location, openingHours, description);
        dataList.add(item);
        openingHours.clear();

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
        description = "ZooMoon is a dynamic shop with a  mix of different brands for young men. Additionally, ZooMoon also organizes workshops for creative young people.";
        tel = "0032 3 689 88 68";
        item = new ListItem(imgId, name,tel, location, openingHours, description);
        dataList.add(item);
        openingHours.clear();


        imgId = R.drawable.drmartens;
        name="Dr. Martens";
        location ="Kammenstraat 41";
        openingHours.put("Monday","10:00 - 18:00");
        openingHours.put("Tuesday","10:00 - 18:00");
        openingHours.put("Wednesday","10:00 - 18:00");
        openingHours.put("Thursday","10:00 - 18:00");
        openingHours.put("Friday","10:00 - 18:00");
        openingHours.put("Saturday","10:00 - 18:00");
        openingHours.put("Sunday","10:00 - 18:00");
        description="For sturdy boots, you have to visit Dr. Martens, Kammenstraat 41. You can get the classic combats, but also other beautiful shoes.";
        tel = "0032 3 231 00 91";
        item = new ListItem(imgId, name, tel, location, openingHours, description);
        dataList.add(item);
        openingHours.clear();

        /** add shop data to shopList*/
        this.shopList.addAll(dataList);
    }

    private void initializeDrinkList() {
        /** create reusable variables for data initializing*/
        ArrayList<ListItem> dataList = new ArrayList<>();
        int imgId;
        String name;
        String location;
        HashMap<String, String> openingHours = new HashMap<>();
        String description;
        String tel;
        ListItem item;

        /**initialize data for drink list*/
        imgId = R.drawable.brasserieappelmans;
        name = "Brasserie Appelmans";
        location = "Papensrtaatje 1";
        openingHours.put("Monday","12:00 - 22:00");
        openingHours.put("Tuesday","12:00 - 22:00");
        openingHours.put("Wednesday","12:00 - 22:00");
        openingHours.put("Thursday","12:00 - 22:00");
        openingHours.put("Friday","12:00 - 22:00");
        openingHours.put("Saturday","12:00 - 22:00");
        openingHours.put("Sunday","12:00 - 22:00");
        description = "At brasserie Appelmans, you will find the most delicious dishes. There is also The Private Bar where you can enjoy a delicious cocktail or a glass of wine.";
        tel = "0032 3 226 20 22";
        item = new ListItem(imgId,name,tel,location,openingHours,description);
        dataList.add(item);
        openingHours.clear();

        imgId = R.drawable.sips;
        name = "Sips";
        location = "Gillisplaats 8";
        openingHours.put("Monday","17:00 - 01:00");
        openingHours.put("Tuesday","17:00 - 01:00");
        openingHours.put("Wednesday","17:00 - 01:00");
        openingHours.put("Thursday","17:00 - 01:00");
        openingHours.put("Friday","17:00 - 01:00");
        openingHours.put("Saturday","17:00 - 01:00");
        openingHours.put("Sunday","17:00 - 01:00");
        description = "Feel like tasting a cocktail recipe from 1790? At Sips, you can enjoy cocktails based on original recipes made with premium labels.";
        tel = "0032 3 257 39 59";
        item = new ListItem(imgId,name,tel,location,openingHours,description);
        dataList.add(item);
        openingHours.clear();

        imgId = R.drawable.divin;
        name = "Divin by Sepi";
        location = "Verschansingstraat 5";
        openingHours.put("Monday","18:00 - 23:00");
        openingHours.put("Tuesday","18:00 - 23:00");
        openingHours.put("Wednesday","closed");
        openingHours.put("Thursday","18:00 - 23:00");
        openingHours.put("Friday","18:00 - 23:00");
        openingHours.put("Saturday","18:00 - 23:00");
        openingHours.put("Sunday","18:00 - 23:00");
        description = "We know Sepideh Sedaghatnia as a sympathetic member of the jury on 'Mijn Pop-Up restaurant'. But did you know she also runs a classy establishment in Antwerp ?";
        tel = "0032 3 284 07 40";
        item = new ListItem(imgId,name,tel,location,openingHours,description);
        dataList.add(item);
        openingHours.clear();

        imgId = R.drawable.soho;
        name = "Soho";
        location = "Marnixplaats 6";
        openingHours.put("Monday","16:00 - 01:00");
        openingHours.put("Tuesday","16:00 - 01:00");
        openingHours.put("Wednesday","16:00 - 01:00");
        openingHours.put("Thursday","16:00 - 01:00");
        openingHours.put("Friday","16:00 - 01:00");
        openingHours.put("Saturday","16:00 - 01:00");
        openingHours.put("Sunday","16:00 - 01:00");
        description = "In the south of the city you will find Soho, a trendy bar part of which is also Tom Waes. Wether you want a beer or a good glass of wine, everyone is welcome!";
        tel = "0032 3 257 18 10";
        item = new ListItem(imgId,name,tel,location,openingHours,description);
        dataList.add(item);
        openingHours.clear();

        this.drinkList.addAll(dataList);
    }

    private void initializeEatList() {
        ArrayList<ListItem> dataList = new ArrayList<>();
        int imgId;
        String name;
        String location;
        HashMap<String, String> openingHours = new HashMap<>();
        String description;
        String tel;
        ListItem item;

        imgId = R.drawable.balls___glory;
        name = "Balls & Glory";
        location = "Godefriduskaai 30";
        openingHours.put("Monday","closed");
        openingHours.put("Tuesday","closed");
        openingHours.put("Wednesday","11:30 - 21:00");
        openingHours.put("Thursday","11:30 - 21:00");
        openingHours.put("Friday","11:30 - 21:00");
        openingHours.put("Saturday","11:30 - 21:00");
        openingHours.put("Sunday","11:30 - 21:00");
        description = "At Balls & Glory, you can get the tastiest, hand turned meatballs filled with their famous, delicious liquid filling. The best meal is one that includes balls!";
        tel = "0032 3 227 16 00";
        item = new ListItem(imgId, name, tel, location, openingHours, description);
        dataList.add(item);
        openingHours.clear();

        imgId = R.drawable.kamiel;
        name = "Café Kamiel";
        location = "Markgravelei 90";
        openingHours.put("Monday","10:00 - 21:00");
        openingHours.put("Tuesday","10:00 - 21:00");
        openingHours.put("Wednesday","10:00 - 21:00");
        openingHours.put("Thursday","10:00 - 21:00");
        openingHours.put("Friday","10:00 - 21:00");
        openingHours.put("Saturday","10:00 - 21:00");
        openingHours.put("Sunday","10:00 - 21:00");
        description = "Café Kamiel is the place to be for breakfast, lunch, apero and a coffee with a piece of pie. The terrace is the ideal place to relax and enjoy the sun.";
        tel = "0032 3 290 38 25";
        item = new ListItem(imgId, name, tel, location, openingHours, description);
        dataList.add(item);
        openingHours.clear();

        imgId = R.drawable.dome;
        name = "Dôme";
        location = "Grote Hondstraat 2";
        openingHours.put("Monday","closed");
        openingHours.put("Tuesday","closed");
        openingHours.put("Wednesday","10:00 - 18:00");
        openingHours.put("Thursday","10:00 - 18:00");
        openingHours.put("Friday","10:00 - 18:00");
        openingHours.put("Saturday","10:00 - 18:00");
        openingHours.put("Sunday","10:00 - 18:00");
        description = "Dôme guarantees top products and excellent quality. The french kitchen serves as a source of inspiration and the chefs create fantastic disches on your plate.";
        tel = "0032 3 239 90 03";
        item = new ListItem(imgId, name, tel, location, openingHours, description);
        dataList.add(item);
        openingHours.clear();

        imgId = R.drawable.stay;
        name = "STAY";
        location = "Nationalestraat 49";
        openingHours.put("Monday","closed");
        openingHours.put("Tuesday","closed");
        openingHours.put("Wednesday","10:00 - 18:00");
        openingHours.put("Thursday","10:00 - 18:00");
        openingHours.put("Friday","10:00 - 18:00");
        openingHours.put("Saturday","10:00 - 18:00");
        openingHours.put("Sunday","10:00 - 18:00");
        description = "STAY in the National street, is the place to be for an all-in-one experience. Shop for an elegant look and enjoy a tasty brunch or lunch!";
        tel = "0032 3 334 55 41";
        item = new ListItem(imgId, name, tel, location, openingHours, description);
        dataList.add(item);
        openingHours.clear();

        this.eatList.addAll(dataList);
    }

    private void initializeSleepList() {
        /** create reusable variables for data initializing*/
        ArrayList<ListItem> dataList = new ArrayList<>();
        int imgId;
        String name;
        String location;
        HashMap<String, String> openingHours = new HashMap<>();
        String description;
        String tel;
        ListItem item;

        imgId = R.drawable.lucyinthesky;
        name = "Lucy in the Sky";
        location = "Huikstraat 46";
        openingHours.put("Monday","00:00 - 23:45");
        openingHours.put("Tuesday","00:00 - 23:45");
        openingHours.put("Wednesday","00:00 - 23:45");
        openingHours.put("Thursday","00:00 - 23:45");
        openingHours.put("Friday","00:00 - 23:45");
        openingHours.put("Saturday","00:00 - 23:45");
        openingHours.put("Sunday","00:00 - 23:45");
        description = "Between the Grand Place and the MAS in Antwerp, you can find B&B Lucy in the Sky. After a weekend of sleeping in a king-size bed, you will return home well-rested.";
        tel = "0032 479 48 27 16";
        item = new ListItem(imgId, name, tel, location, openingHours, description);
        dataList.add(item);
        openingHours.clear();

        imgId = R.drawable.hotelmatelote;
        name = "Hotel Matelote";
        location = "Haarstraat 11a";
        openingHours.put("Monday","07:00 - 22:00");
        openingHours.put("Tuesday","07:00 - 22:00");
        openingHours.put("Wednesday","07:00 - 22:00");
        openingHours.put("Thursday","07:00 - 22:00");
        openingHours.put("Friday","07:00 - 22:00");
        openingHours.put("Saturday","07:00 - 22:00");
        openingHours.put("Sunday","07:00 - 22:00");
        description = "After a shopping day, stay in one of the nine unforgettable rooms at Hotel Matelore in Antwerp, and return home completely relaxed and well-rested!";
        tel = "0032 3 201 88 00";
        item = new ListItem(imgId, name, tel, location, openingHours, description);
        dataList.add(item);
        openingHours.clear();

        imgId = R.drawable.aplace;
        name = "APlace";
        location = "Vrijdagmarkt 1";
        openingHours.put("Monday","00:00 - 23:00");
        openingHours.put("Tuesday","00:00 - 23:00");
        openingHours.put("Wednesday","00:00 - 23:00");
        openingHours.put("Thursday","00:00 - 23:00");
        openingHours.put("Friday","00:00 - 23:00");
        openingHours.put("Saturday","00:00 - 23:00");
        openingHours.put("Sunday","00:00 - 23:00");
        description = "Aplace in Antwerp is a nice place where you can stay overnight. Two suites and two flats are nicely decorated with vintage furniture so you will feel right at home.";
        tel = "0032 473 73 56 50";
        item = new ListItem(imgId, name, tel, location, openingHours, description);
        dataList.add(item);
        openingHours.clear();

        imgId = R.drawable.hoteljulien;
        name = "Hotel Julien";
        location = "Korte Nieuwstraat 24";
        openingHours.put("Monday","00:00 - 23:45");
        openingHours.put("Tuesday","00:00 - 23:45");
        openingHours.put("Wednesday","00:00 - 23:45");
        openingHours.put("Thursday","00:00 - 23:45");
        openingHours.put("Friday","00:00 - 23:45");
        openingHours.put("Saturday","00:00 - 23:45");
        openingHours.put("Sunday","00:00 - 23:45");
        description = "at Hotel Julien, you can sleep in a 16th century-inspired setting with a contemporary touch and luxurious finish. Relax in the spa with a hammam and sauna!";
        tel = "0032 3 229 06 00";
        item = new ListItem(imgId, name, tel, location, openingHours, description);
        dataList.add(item);
        openingHours.clear();

        this.sleepList.addAll(dataList);
    }
}
