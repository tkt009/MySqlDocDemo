package com.example.MongoDemo.controller;

import com.example.MongoDemo.model.Demo;
import com.example.MongoDemo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {
    @Autowired
    private DemoService demoService;

    @PostMapping("/addDemo")
    @ResponseBody
    public String addDemoDoc(@RequestBody Demo d){
       // Demo d1 = new Demo("Flourie",19,true);
        demoService.addDemoObject(d);
        return "Ok";
    }
}
