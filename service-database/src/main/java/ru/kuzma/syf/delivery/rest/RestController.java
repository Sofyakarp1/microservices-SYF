package ru.kuzma.syf.delivery.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.text.ParseException;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @PostMapping(path = "/something/first", consumes = "text/plain")
    public String testPlatform(@RequestBody String member)throws ParseException {
        System.out.println(member.toString() + "first");
        return "rerere";
    }

    // /something/third
//
//    @GetMapping(path = "/something/third/token-cache")
//    public String mockToken()throws ParseException {
//        System.out.println("third method");
//        return "{\"result\":\"okk\"}";
//    }
}
