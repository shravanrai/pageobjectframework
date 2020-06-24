package com.hldoc.dataproviders;

import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class BusDetailsDP {

    @DataProvider(name = "busDetailsPositive")
    public Object[][] busDetailsDate(){
        return new Object[][]{
            {"2020-05-20", "Cameron Highlands", "Kuala Lumpur"},
            {"2020-05-20", "Cameron Highlands", "Kuala"}
        };
    }


    @DataProvider(name = "NegativeIterator")
    public Iterator<Object[]> busDetailsDateNeg(){
        ArrayList<Object[]> objects = new ArrayList<>();
        objects.add(new Object[]{"2020-05-20", "Cameron Highlands", "Kuala LumpurNegative"});
        objects.add(new Object[]{"2020-05-20", "Cameron Highlands", "Kuala LumpurNegative"});
        return (Iterator<Object[]>) objects;
    }

    @DataProvider(name = "NegativeMap")
    public Object[][] busDetailsDateNeg2(){

        Object[][] objects = new Object[2][1];
        HashMap<String, String> stringStringHashMap1 = new HashMap<>();
        stringStringHashMap1.put("date", "2020-05-20");
        stringStringHashMap1.put("from", "Cameron Highlands");
        stringStringHashMap1.put("to", "Kuala LumpurNegative");

        HashMap<String, String> stringStringHashMap2 = new HashMap<>();
        stringStringHashMap2.put("date", "2020-05-20");
        stringStringHashMap2.put("from", "Cameron Highlands");
        stringStringHashMap2.put("to", "Kuala LumpurNegative");

        objects[0][0]=stringStringHashMap1;
        objects[1][0]=stringStringHashMap2;

        return objects;

    }

}
