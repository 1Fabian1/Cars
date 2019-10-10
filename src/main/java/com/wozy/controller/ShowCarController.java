package com.wozy.controller;

import com.wozy.model.Car;
import com.wozy.model.QueryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@Controller
public class ShowCarController {

    @RequestMapping(value = {"/searchCars"}, method = RequestMethod.POST)
    public String testCars(Model model, @RequestParam("brand") String brand, @RequestParam("model") String modell) throws IOException {

        String address = "http://34.90.90.63/elasticsearch/auta/_search?q=";
        Car car = new Car();
        car.setBrand(brand);
        car.setModel(modell);
        QueryBuilder qb = new QueryBuilder();
        String addressWithQuery = qb.produceString(address,car);

        System.out.println(addressWithQuery);



        URL url = new URL(addressWithQuery);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("POST");

        connection.setRequestProperty("Content-Type", "application/json");
        connection.setRequestProperty("Authorization", "Basic dXNlcjpYTmdSV1hCWFdOSDE=");

        connection.setConnectTimeout(500);
        connection.setReadTimeout(500);

        connection.setInstanceFollowRedirects(false);


        int status = connection.getResponseCode();
        System.out.println("status:" + status);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();

        connection.disconnect();
        model.addAttribute("response", content);


        return "searchCars";
    }

}


