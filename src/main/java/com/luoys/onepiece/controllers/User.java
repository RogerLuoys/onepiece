package com.luoys.onepiece.controllers;

import com.luoys.onepiece.dal.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class User {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/queryByTel",method = RequestMethod.GET)
    public String queryByTel() {
        String userName = userMapper.queryByTel("13111111111");

        return userName;
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
