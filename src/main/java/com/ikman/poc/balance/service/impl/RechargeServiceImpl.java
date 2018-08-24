package com.ikman.poc.balance.service.impl;

import com.ikman.poc.balance.entity.Recharge;
import com.ikman.poc.balance.repo.RechargeRepo;
import com.ikman.poc.balance.service.RechargeService;
import org.springframework.beans.factory.annotation.Autowired;

public class RechargeServiceImpl implements RechargeService {

    @Autowired
    private RechargeRepo rechargeRepo;

    @Override
    public Recharge create(Recharge recharge) {
        return rechargeRepo.save(recharge);
    }
}
