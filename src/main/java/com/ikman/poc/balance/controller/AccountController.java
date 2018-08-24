package com.ikman.poc.balance.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/accounts")
public class AccountController {


    @RequestMapping(value = "/balance")
    public ResponseEntity<String> getBalance(){

        return  ResponseEntity.ok("");
    }


}
