package com.example.FireFinalTask.controller;

import com.example.FireFinalTask.model.FireItem;
import com.example.FireFinalTask.services.methods;
import com.example.FireFinalTask.repos.MessageRepo;
import com.example.FireFinalTask.services.CSVParser;
import com.example.FireFinalTask.services.methods_parallel1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Map;

@Controller
public class MainController {
    @Autowired
    private MessageRepo messageRepo;

    @GetMapping("/")
    public String greeting(Map<String, Object> model) {
        return "greeting";
    }

    @GetMapping("/main")
    public String main(Map<String, Object> model) throws Exception {
        CSVParser csvParser = new CSVParser();
        List<FireItem> dataset = csvParser.read();
        methods Statistic = new methods(dataset);
        Instant start = Instant.now();

        String MaxCountFiresByCountry = Statistic.getMaxCountFiresByCountry();
        model.put("MaxCountFiresByCountry", MaxCountFiresByCountry);

        String MinCountFiresByCountry = Statistic.getMinCountFiresByCountry();
        model.put("MinCountFiresByCountry", MinCountFiresByCountry);


        String AvgCountFiresByCountry = Statistic.getAvgCountFiresByCountry();
        model.put("AvgCountFiresByCountry", AvgCountFiresByCountry);

        String PercentCause = Statistic.getPercentCause();
        model.put("PercentCause", PercentCause);


        String MaxAcresFire = Statistic.getMaxAcresFire();
        model.put("MaxAcresFire", MaxAcresFire);

        String MinAcresFire = Statistic.getMinAcresFire();
        model.put("MinAcresFire", MinAcresFire);

        Instant end = Instant.now();
        Duration duration = Duration.between(start, end);
        model.put("duration", duration.toMillis() + " milliseconds");

        methods_parallel1 Statistic1 = new methods_parallel1(dataset);

        Instant start_parallel1 = Instant.now();

        String MaxCountFiresByCountry_parallel1 = Statistic1.getMaxCountFiresByCountry_parallel1();
        model.put("MaxCountFiresByCountry_parallel1", MaxCountFiresByCountry_parallel1);

        String MinCountFiresByCountry_parallel1 = Statistic1.getMinCountFiresByCountry_parallel1();
        model.put("MinCountFiresByCountry_parallel1", MinCountFiresByCountry_parallel1);

        String AvgCountFiresByCountry_parallel1 = Statistic1.getAvgCountFiresByCountry_parallel1();
        model.put("AvgCountFiresByCountry_parallel1", AvgCountFiresByCountry_parallel1);

        String PercentCause_parallel1 = Statistic1.getPercentCause_parallel1();
        model.put("PercentCause_parallel1", PercentCause_parallel1);

        String MaxAcresFire_parallel1 = Statistic1.getMaxAcresFire_parallel1();
        model.put("MaxAcresFire_parallel1", MaxAcresFire_parallel1);

        String MinAcresFire_parallel1 = Statistic1.getMinAcresFire_parallel1();
        model.put("MinAcresFire_parallel1", MinAcresFire_parallel1);

        Instant end_parallel1 = Instant.now();
        Duration duration_parallel1 = Duration.between(start_parallel1, end_parallel1);
        model.put("duration_parallel1", duration_parallel1.toMillis() + " milliseconds");

        return "main";
    }


}
