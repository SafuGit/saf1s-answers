package com.safu.saf1_cheats;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HomeController {

    @GetMapping({"/", "/home", "/status"})
    public String getStatus() {
        return "Application is up & Running";
    }
    
}
