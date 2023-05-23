package com.TemperatureSchool.School.controller;

import com.TemperatureSchool.School.database.repository.TemperatureRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
@AllArgsConstructor
public class TempController {
    @Autowired
    private final TemperatureRepository temps;
    @GetMapping
    String tempDisplay(Model model) {
        model.addAttribute("temp", temps.findById(1l).get().getTemperature());
        return "temp.html";
    }
}
