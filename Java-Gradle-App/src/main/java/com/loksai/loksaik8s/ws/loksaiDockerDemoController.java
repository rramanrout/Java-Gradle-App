package com.loksai.loksaik8s.ws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class loksaiDockerDemoController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello - loksai-k8s I Have updated the message";
    }
}

