package com.wozy.controller;

import com.wozy.model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    private static List<Car> cars = new ArrayList<>();
    static {
        cars.add(new Car("Opel", "Astra", 2000));
        cars.add(new Car("Opel", "Vectra", 2001));
    }

    @RequestMapping(value = {"/","/index"}, method = RequestMethod.GET)
    public String index(Model model){
        String message = "Hello Spring & JSP";
        model.addAttribute("message", message);

        return "index";
    }

    @RequestMapping(value = {"/carList"}, method = RequestMethod.GET)
    public String viewCarList(Model model){
        model.addAttribute("cars", cars);
        return "carList";
    }
}
