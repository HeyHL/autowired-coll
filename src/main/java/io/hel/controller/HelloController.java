package io.hel.controller;

import io.hel.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * helei
 * 2022/3/23 11:44
 * description:
 */
@SuppressWarnings("all")
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello/{lang}")
    public String hello(@PathVariable(value = "lang") String lang) {
//        System.out.println(lang);
        return helloService.sayHello("world", lang);
    }
}
