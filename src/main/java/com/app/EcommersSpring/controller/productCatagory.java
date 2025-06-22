package com.app.EcommersSpring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/catagory")
public class productCatagory {

    @GetMapping("/get")
    public String catagoryName(){
        return "Electronecs";
    }
}
