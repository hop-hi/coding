package com.mh.spring.SpringTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TestController {

    @Autowired
    ISample sample;

    @GetMapping("/hello")
    public List<String> hello(){
        return sample.call();
    }

}
