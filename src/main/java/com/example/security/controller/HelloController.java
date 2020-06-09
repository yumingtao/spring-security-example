package com.example.security.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @author yumingtao
 */
@RestController
@Slf4j
public class HelloController {

    @PostMapping("/hello")
    public String hello(@RequestParam(value = "name") String name){
        log.info("The name is {}", name);
        return "Hello, " + name;
    }

    @GetMapping("/hello2/{name}")
    public String hello2(@PathVariable(value = "name") String name){
        log.info("The name is {}", name);
        return "Hello, " + name;
    }
}
