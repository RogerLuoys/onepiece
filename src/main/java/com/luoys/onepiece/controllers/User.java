package com.luoys.onepiece.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class User {

    @RequestMapping(value = "/queryAllUser",method = RequestMethod.GET)
    public List<Map<String, Object>> queryAllUser() {
        return null;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(String account, String passwd) {
        return null;
    }

    @RequestMapping(value = "/changePW", method = RequestMethod.PUT)
    public String changePW(String account, String passwd) {
        return null;
    }

    @RequestMapping(value = "/deleteUser", method = RequestMethod.DELETE)
    public String deleteUser(String account) {
        return null;
    }
}
