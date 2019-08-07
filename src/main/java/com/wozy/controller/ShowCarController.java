package com.wozy.controller;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;

@Controller
public class ShowCarController {

    @RequestMapping(value = {"/test"}, method = RequestMethod.GET)
    public String testCars(Model model){

        RestTemplate restTemplate = new RestTemplate();

        String requestJson = "{\n" +
                "  \"size\": 10,\n" +
                "  \"from\": 0, \n" +
                "  \"query\": {\n" +
                "    \"match\": {\n" +
                "      \"brand\": \"BMW\"\n" +
                "    }\n" +
                "  }\n" +
                "}";


        restTemplate.exchange
                ("http://34.90.90.63/elasticsearch/auta/_search", HttpMethod.POST,
                new HttpEntity<String>(createHeaders("user", "XNgRWXBXWNH1")), String.class);





        String something = "Works :D";
        model.addAttribute("something", something);
        return "test";
    }

    HttpHeaders createHeaders(String username, String password){
        return new HttpHeaders() {{
            String auth = username + ":" + password;
            byte[] encodedAuth = Base64.encodeBase64(
                    auth.getBytes(Charset.forName("US-ASCII")) );
            String authHeader = "Basic " + new String( encodedAuth );
            set( "Authorization", authHeader );
        }};
    }

}
