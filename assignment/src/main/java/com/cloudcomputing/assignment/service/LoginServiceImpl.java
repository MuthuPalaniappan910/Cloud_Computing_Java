package com.cloudcomputing.assignment.service;

import java.util.HashMap;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    public String login(String userName, String password) {
        return this.validateUserCredentials(userName, password);
    }

    private String validateUserCredentials(String userName, String password) {
        HashMap<String, String> credentials = new HashMap();
        credentials.put("Dhoni", "Helicopter");
        credentials.put("Kohli", "CoverDrive");
        credentials.put("Jaddu", "SwordKing");
        if (credentials.containsKey(userName)) {
            String userPassword = (String)credentials.get(userName);
            return password.equalsIgnoreCase(userPassword) ? "Login Successful" : "OOPS!!Incorrect Password.";
        } else {
            return "OOPS!!!User does not exist. Please Register to Continue.";
        }
    }
}
