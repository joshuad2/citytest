package org.example.cities;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StagingController {

    @RequestMapping("/")
    public String index() {
        String timestamp = System.getProperty("staging.timestamp");
        return "HEY PCF ROADSHOW TAMPA!!!!! Not Orlando haha!!!";
    }
}
