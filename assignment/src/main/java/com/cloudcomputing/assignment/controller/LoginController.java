package com.cloudcomputing.assignment.controller;

import com.cloudcomputing.assignment.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    LoginService loginService;

    @GetMapping("/login")
    public String login(@RequestParam String userName, @RequestParam String password) {
        return userName.length() != 0 && password.length() != 0 ? loginService.login(userName, password) : "Please fill the mandatory fields";
    }
}
