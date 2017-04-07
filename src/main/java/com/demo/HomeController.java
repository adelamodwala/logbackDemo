package com.demo;

import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by adel.amodwala on 4/7/2017.
 */
@RequestMapping(value = "/home")
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public @ResponseBody HelloDTO sayHello(RequestEntity request) {
        return new HelloDTO("what's up", request);
    }
}
