package com.shireen.springsecurityauth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String sayHello() {
       return "say hello everyone";
    }

    @GetMapping("/user")
    public String sayUserHello() {
        return "say hello User";
    }

    @GetMapping("/admin")
    public String sayAdminHello() {
        return "say hello Admin";
    }
}
