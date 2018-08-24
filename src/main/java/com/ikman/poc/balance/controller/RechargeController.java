package com.ikman.poc.balance.controller;


import com.ikman.poc.balance.entity.Recharge;
import com.ikman.poc.balance.service.RechargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/recharges")
public class RechargeController  {


    @Autowired
    private RechargeService rechargeService;

    @PostMapping
    public ResponseEntity<Recharge> create(Recharge recharge){
        return ResponseEntity.ok(rechargeService.create(recharge));
    }


}
