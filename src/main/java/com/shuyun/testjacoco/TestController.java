package com.shuyun.testjacoco;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/hello")
    public String sayHello(@RequestParam("who") String who) {
        if (who.equals("xiaoym")) {
            return "Say hello to myself";
        }
        else {
            return "Hello " + who;
        }
    }
}