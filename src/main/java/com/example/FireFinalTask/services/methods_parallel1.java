package com.example.FireFinalTask.services;

import com.example.FireFinalTask.model.CountByCountry;
import com.example.FireFinalTask.model.FireItem;
import com.example.FireFinalTask.model.String_float;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicReference;

import static java.lang.Integer.MAX_VALUE;

public class methods_parallel1 {
    private List<FireItem> Fires;
    public methods_parallel1(List<FireItem> Fires) {
        this.Fires = Fires;
    }

    public String getMaxCountFiresByCountry_parallel1() throws Exception {
            List<Callable<CountByCountry>> tasks = new ArrayList<Callable<CountByCountry>>();
            Set<String> countries = new HashSet<>();
            for (FireItem fire : Fires) {
                String curCountry = fire.getDistrictName();
                if (!countries.contains(curCountry)) {
                    countries.add(curCountry);
                    tasks.add(() -> {
                        int curCount = 0;
                        for (FireItem curFires : Fires) {
                            if (curFires.getDistrictName().equals(curCountry)) {
                                curCount += 1;
                            }
                        }
                        return new CountByCountry(curCountry, curCount);
                    });
                }
            }
        ExecutorService exec = Executors.newCachedThreadPool();
        try {
            List<Future<CountByCountry>> result = exec.invokeAll(tasks);
            String country = "";
            int max = 0;
            for (Future<CountByCountry> i : result) {
                if (i.get().getCount() >= max) {
                    max = i.get().getCount();
                    country = i.get().getCountry();
                }
            }
            return country + ": " + max;
        }
        finally {
            exec.shutdown();
        }
    }

    public String getMinCountFiresByCountry_parallel1() throws Exception {
        List<Callable<CountByCountry>> tasks = new ArrayList<Callable<CountByCountry>>();
        Set<String> countries = new HashSet<>();
        for (FireItem fire : Fires) {
            String curCountry = fire.getDistrictName();
            if (!countries.contains(curCountry)) {
                countries.add(curCountry);
                tasks.add(() -> {
                    int curCount = 0;
                    for (FireItem curFires : Fires) {
                        if (curFires.getDistrictName().equals(curCountry)) {
                            curCount += 1;
                        }
                    }
                    return new CountByCountry(curCountry, curCount);
                });
            }
        }
        ExecutorService exec = Executors.newCachedThreadPool();
        try {
            List<Future<CountByCountry>> result = exec.invokeAll(tasks);
            String country = "";
            int min = MAX_VALUE;
            for (Future<CountByCountry> i : result) {
                if (i.get().getCount() <= min) {
                    min = i.get().getCount();
                    country = i.get().getCountry();
                }
            }
            return country + ": " + min;

        } finally {
            exec.shutdown();
        }
    }


    public String getAvgCountFiresByCountry_parallel1() throws Exception {
        List<FutureTask<CountByCountry>> result = new ArrayList<FutureTask<CountByCountry>>();
        Set<String> countries = new HashSet<>();
        for (FireItem fire : Fires) {
            String curCountry = fire.getDistrictName();
            if (!countries.contains(curCountry)) {
                countries.add(curCountry);
                FutureTask<CountByCountry> task = new FutureTask<>(() -> {
                    int curCount = 0;
                    List<Integer> years = new ArrayList<>();
                    for (FireItem curFires : Fires) {
                        if (curFires.getDistrictName().equals(curCountry)) {
                            curCount += 1;
                            if (!years.contains(curFires.getFireYear())){
                                years.add(curFires.getFireYear());
                            }
                        }
                    }
                    return new CountByCountry(curCountry, curCount/years.size());
                });
                result.add(task);
                ExecutorService exec = Executors.newCachedThreadPool();
                exec.submit(task);
            }
        }

        String res = "";
            for (FutureTask<CountByCountry> i : result) {
                res += i.get().getCountry() + ":   " + i.get().getCount() + ", \n";
            }
        return res;
    }

    public String getPercentCause_parallel1() throws Exception {
        List<FutureTask<CountByCountry>> result = new ArrayList<FutureTask<CountByCountry>>();
        Set<String> causes = new HashSet<>();
        for (FireItem fire : Fires) {
            String curCause = fire.getHumanOrLightning();
            if (!causes.contains(curCause)) {
                causes.add(curCause);
                FutureTask<CountByCountry> task = new FutureTask<>(() -> {
                    int curCount = 0;
                    for (FireItem curFires : Fires) {
                        if (curFires.getHumanOrLightning().equals(curCause)) {
                            curCount += 1;
                        }
                    }
                    return new CountByCountry(curCause, 100 * curCount / Fires.size());
                });
                result.add(task);
                ExecutorService exec = Executors.newCachedThreadPool();
                exec.submit(task);
            }
        }

        String res = "";
        for (FutureTask<CountByCountry> i : result) {
            res += i.get().getCountry() + ":   " + i.get().getCount() + "%" + ", \n";
        }
            return res;
        }

    public String getMaxAcresFire_parallel1() throws Exception {
        Optional<String_float> result = Fires.parallelStream()
                .max(Comparator.comparing(FireItem::getEstTotalAcres))
                .map(fireItem -> new String_float(fireItem.getFireName(), fireItem.getEstTotalAcres()));
        return result.get().getCountry() + ":  " + result.get().getCount();
    }

    public String getMinAcresFire_parallel1() throws Exception {
        Optional<String_float> result = Fires.parallelStream()
                .min(Comparator.comparing(FireItem::getEstTotalAcres))
                .map(fireItem -> new String_float(fireItem.getFireName(), fireItem.getEstTotalAcres()));
        return result.get().getCountry() + ":  " + result.get().getCount();
    }


}
