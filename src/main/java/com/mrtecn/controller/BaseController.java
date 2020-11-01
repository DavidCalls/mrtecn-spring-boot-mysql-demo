package com.mrtecn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author buildgreatdragon
 */
@RestController
@RequestMapping("/say")
public class BaseController {
    @GetMapping("/hello")
    public String sayHi(){
        return "hello word!";
    }
}
