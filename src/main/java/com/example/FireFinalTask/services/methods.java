package com.example.FireFinalTask.services;

import com.example.FireFinalTask.model.FireItem;

import java.util.*;

import static java.lang.Integer.MAX_VALUE;

public class methods {
    private List<FireItem> Fires;
    public methods(List<FireItem> Fires) {
        this.Fires = Fires;
    }

    public String getMaxCountFiresByCountry() {
        Map<String, Integer> result = new HashMap<>();
        for (FireItem fire : Fires) {
            String curCountry = fire.getDistrictName();
            if(!result.containsKey(curCountry)){
                int curCount = 0;
                for (FireItem curFires : Fires){
                    if (curFires.getDistrictName().equals(curCountry)) {
                        curCount+=1;
                    }
                }
                result.put(curCountry,curCount);
            }
        }

        String country = "";
        int max = 0;
        for(Map.Entry<String, Integer> i : result.entrySet()){
            if (i.getValue() >= max){
                max = i.getValue();
                country = i.getKey();
            }
        }
        return country + ": " + max;
    }

    public String getMinCountFiresByCountry() {
        Map<String, Integer> result = new HashMap<>();
        for (FireItem fire : Fires) {
            String curCountry = fire.getDistrictName();
            if(!result.containsKey(curCountry)){
                int curCount = 0;
                for (FireItem curFires : Fires){
                    if (curFires.getDistrictName().equals(curCountry)) {
                        curCount+=1;
                    }
                }
                result.put(curCountry,curCount);
            }
        }

        String country = "";
        int min = MAX_VALUE;
        for(Map.Entry<String, Integer> i : result.entrySet()){
            if (i.getValue() <= min){
                min = i.getValue();
                country = i.getKey();
            }
        }
        return country + ": " + min;
    }


    public String getAvgCountFiresByCountry() {
        Map<String, Integer> result = new HashMap<>();
        for (FireItem fire : Fires) {
            String curCountry = fire.getDistrictName();
            if (!result.containsKey(curCountry)){
                int curCount = 0;
                List<Integer> years = new ArrayList<>();
                for (FireItem curFires : Fires){
                    if (curFires.getDistrictName().equals(curCountry)) {
                        curCount+=1;
                        if (!years.contains(curFires.getFireYear())){
                            years.add(curFires.getFireYear());
                        }
                    }
                }
                result.put(curCountry, curCount/years.size());
            }
        }

        String res = "";
        for (Map.Entry<String, Integer> i : result.entrySet()){
            res += i.getKey() + ":   " + i.getValue() + ", \n";
        }

        return res;
    }

    public String getPercentCause(){
        Map<String, Integer> result = new HashMap<>();
        for (FireItem fire : Fires) {
            String curCause = fire.getHumanOrLightning();
            if (!result.containsKey(curCause)){
                int curCount = 0;
                for (FireItem curFires : Fires) {
                    if (curFires.getHumanOrLightning().equals(curCause)) {
                        curCount += 1;
                    }
                }
                result.put(curCause, 100*curCount/Fires.size());
            }
        }

        String Result = "";
        for (Map.Entry<String, Integer> i : result.entrySet()){
            Result += i.getKey() + ":   " + i.getValue() + "%" + ", \n";
        }

        return Result;
    }

    public String getMaxAcresFire() {
        String fireName = "";
        float max = 0;
        for(FireItem fire : Fires){
            if (fire.getEstTotalAcres() >= max){
                max = fire.getEstTotalAcres();
                fireName = fire.getFireName();
            }

        }
        return fireName + ":  " + max;
    }

    public String getMinAcresFire() {
        String fireName = "";
        float min = Float.MAX_VALUE;
        for(FireItem fire : Fires){
            if (fire.getEstTotalAcres() <= min){
                min = fire.getEstTotalAcres();
                fireName = fire.getFireName();
            }

        }
        return fireName + ":  " + min;
    }


}
