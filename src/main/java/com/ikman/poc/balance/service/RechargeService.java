package com.ikman.poc.balance.service;

import com.ikman.poc.balance.entity.Recharge;
import org.springframework.stereotype.Service;

@Service
public interface RechargeService {
    Recharge create(Recharge recharge);
}
