package com.school.Spring_Boot_Temperature.controller;

import com.school.Spring_Boot_Temperature.database.repository.TemperatureRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Date;
import java.util.Calendar;

@Controller
@RequestMapping("/")
@AllArgsConstructor
public class TempController {
    @Autowired
    private final TemperatureRepository temps;
    @GetMapping
    String tempDisplay(Model model) {
        Calendar start = Calendar.getInstance();
        start.set(2023, Calendar.MAY, 29, 0, 0);
        Date start_time = new Date(start.getTime().getTime());

        Calendar end = Calendar.getInstance();
        Date end_time = new Date(end.getTime().getTime());

        model.addAttribute("temp", temps.getTemperatureByTimespan(2849802, start_time, end_time));
        return "temp.html";
    }
}
