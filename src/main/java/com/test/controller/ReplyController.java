package com.test.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReplyController {
    public String reply(String name){
        return  "hello1"+name;

    }


}
