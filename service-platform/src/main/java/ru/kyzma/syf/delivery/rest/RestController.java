package ru.kyzma.syf.delivery.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.text.ParseException;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @PostMapping(path = "/data/json", consumes = "text/plain")
    public String getDataFromPlatform(@RequestBody String member)throws ParseException {
        System.out.println(member.toString() + "second");
        return "kekekeke";
    }
}
