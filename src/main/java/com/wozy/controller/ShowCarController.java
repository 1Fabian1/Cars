package com.wozy.controller;

import com.google.gson.Gson;
import com.wozy.model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ShowCarController {

    @RequestMapping(value = {"/test"}, method = RequestMethod.GET)
    public String testCars(Model model){
        String something = "AAAAAAAA";
        model.addAttribute("something", something);
        return "test";
    }



    String address = "34.90.90.63/elasticsearch/auta/_search";
    String body = "{\n" +
            "  \"size\": 10,\n" +
            "  \"from\": 0, \n" +
            "  \"query\": {\n" +
            "    \"match\": {\n" +
            "      \"brand\": \"BMW\"\n" +
            "    }\n" +
            "  }\n" +
            "}";
}
