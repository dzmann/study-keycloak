package com.keycloak.study.studykeycloak.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/study")
public class SampleController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, this is a test endpoint";
    }

    @GetMapping("/goodbye")
    public String sayBye() {
        return "Bye, this was a test endpoint";
    }

}
