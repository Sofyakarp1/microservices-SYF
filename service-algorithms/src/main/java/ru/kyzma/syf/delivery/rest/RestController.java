package ru.kyzma.syf.delivery.rest;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.text.ParseException;

@org.springframework.web.bind.annotation.RestController
public class RestController {

//    @PostMapping(path = "/something/first/ghj", consumes = "text/plain")
//    public String testPlatform(@RequestBody String member)throws ParseException {
//        System.out.println(member.toString() + "first");
//        return "rerere";
//    }
//
//    @PostMapping(path = "/something/second", consumes = "text/plain")
//    public String testPlatformSecond(@RequestBody String member)throws ParseException {
//        System.out.println(member.toString() + "second");
//        return "kekekeke";
//    }

    // /something/third

    @GetMapping(path = "/something/third/token-cache")
    public String mockToken()throws ParseException {
        System.out.println("third method");
        return "{\"result\":\"okk\"}";
    }
}
