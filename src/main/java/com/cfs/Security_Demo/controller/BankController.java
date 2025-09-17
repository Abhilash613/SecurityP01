package com.cfs.Security_Demo.controller;


import org.springframework.web.bind.ServletRequestParameterPropertyValues;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
    int bal=1000;

    @GetMapping("/bal")
    public String getBalance(){
        return "1000";

    }

    @PostMapping("/add")
    public int UpdateBalance(@RequestParam String AcctNo,@RequestParam int num){
        return bal+num;
    }

    @GetMapping("/contact")
    private String ContactUs(){
        return "You can contact me at:7377936590";
    }
}
